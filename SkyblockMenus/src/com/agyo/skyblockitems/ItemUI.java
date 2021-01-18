package com.agyo.skyblockitems;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemUI {
    public void displayItemUI(Player player) {
        //Beginning
        Inventory gui = Bukkit.createInventory(null, 54, ChatColor.DARK_BLUE + "Item Menu");
        //Lores

        List<String> swordLore = new ArrayList<>();
        swordLore.add(ChatColor.GRAY + "Brings you to the sword section.");
        List<String> armorLore = new ArrayList<>();
        armorLore.add(ChatColor.GRAY + "Brings you to the armor section.");
        List<String> bowLore = new ArrayList<>();
        bowLore.add(ChatColor.GRAY + "Brings you to the bow section.");

        //ItemStacks
        ItemStack sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta meta = sword.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Swords");
        meta.setLore(swordLore);
        sword.setItemMeta(meta);

        ItemStack armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta armorMeta = armor.getItemMeta();
        armorMeta.setDisplayName(ChatColor.GOLD + "Armor");
        armorMeta.setLore(armorLore);
        armor.setItemMeta(armorMeta);

        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.GOLD + "Bows");
        bowMeta.setLore(bowLore);
        bow.setItemMeta(bowMeta);

        //Item Setting

        gui.setItem(47, sword);
        gui.setItem(49, armor);
        gui.setItem(51, bow);

        //Final
        player.openInventory(gui);
    }
}