package com.agyo.skyblockmenus;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class itemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (args[0].equalsIgnoreCase("AOTE")) {
            player.sendMessage(ChatColor.GRAY + "" + player + " Has received an " + ChatColor.GREEN + "Aspect of the end!");
        }
        player.sendMessage(ChatColor.GREEN + "You used the item command!");
        return false;
    }
}
