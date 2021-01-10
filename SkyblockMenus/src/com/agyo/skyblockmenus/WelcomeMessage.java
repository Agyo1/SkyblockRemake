package com.agyo.skyblockmenus;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class WelcomeMessage
 {
     public void generateAndSendWelcomeMessage(Player player) {
           player.sendMessage(ChatColor.YELLOW +
           player.getDisplayName() + "\n" +
           "This is your island!\n" +
           "The SkyBlock universe has many lands to discover, secrets to uncover, and people to meet. \n +" +
           "Collect resources, craft items, and complete objectives to complete your way through SkyBlock.\n" +
           "Have fun!");
     }
}
