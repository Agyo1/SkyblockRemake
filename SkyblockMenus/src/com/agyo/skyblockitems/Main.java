package com.agyo.skyblockitems;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents((new EventHandlerBase()), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Skyblock Items has been enabled");
        getCommand("item").setExecutor(new ItemCommand());

        DatabaseService db = new DatabaseService();
        try {
            db.loadDriver();
            System.out.println("Connected!");
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        ResultSet rs = null;
        Map itemAndDamage = new HashMap();
        try {
            rs = db.getResultSet("Select * from items");

            while (rs.next()) {
                String item = rs.getString(2);
                String strength = rs.getString(7);
                String damage = rs.getString(4);
                StringBuilder resp = new StringBuilder();
                resp.append("Item ");
                resp.append(item);
                resp.append(" has strength of ");
                resp.append(strength);
                resp.append(" and causes damage of ");
                resp.append(damage);
                //itemAndDamage.put(item,damage);
                //System.out.println(resp.toString());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //itemAndDamage.forEach((k, v) -> {
        //    System.out.println("Key: " + k + ", Value: " + v);
        //});
    }

    @Override
    public void onDisable() {
        Bukkit.getPluginManager().registerEvents((new EventHandlerBase()), this);
        System.out.println("TestPlugin has been disabled");
    }
}