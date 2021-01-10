package com.agyo.skyblockmenus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.http.WebSocket;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
	Bukkit.getPluginManager().registerEvents((new EventHandlerBase()), this);
        getCommand("item").setExecutor(new ItemCommand());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Skyblock Menus has been enabled!");
    }
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Skyblock Menus has been disabled");
    }

    private void spawnStand(Location location) {

    }
}
