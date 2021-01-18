package com.agyo.skyblockitems;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class StoreOwner {

    public Map getSwordDamage(Player player) {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
        for(Material c : Material.values())
            System.out.println(c);
        for(Material c : Material.values())
            System.out.println(c);
        player.getInventory().addItem(itemStack);
        player.sendMessage("Here you go!");
        Map swordAndDamage = new HashMap();
//        for (Sword sword : Swords) {
//            swordAndDamage.put(sword, sword.getDamage());
//        }
        return swordAndDamage;
    }
}


