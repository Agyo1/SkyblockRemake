package com.agyo.SkyblockItems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class SBIMain extends JavaPlugin{
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new ItemsListener(), this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Skyblock Items has been enabled");
		getCommand("item").setExecutor(new itemCommand());
	}
	public static void itemUI(Player player) {
		//Beginning
		Inventory gui = Bukkit.createInventory(null, 54, ChatColor.DARK_BLUE + "Item Menu");
		//Lores
		
		List<String> swordLore = new ArrayList<>();
		swordLore.add(ChatColor.GRAY + "Brings you to the sword section.");
		
		//ItemStacks
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Swords");
		item.setItemMeta(meta);
		meta.setLore(swordLore);
		//Item Setting
		
		gui.setItem(46, item);
		
		//Final
		player.openInventory(gui);
		
	}
}
