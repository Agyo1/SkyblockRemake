package com.agyo.skyblockitems;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ItemDisplay
{
    public void displayItems(Player player) {

        player.sendMessage(ChatColor.YELLOW +
                player.getDisplayName() + "\n" +
                " here are your items: ");
    }
}
