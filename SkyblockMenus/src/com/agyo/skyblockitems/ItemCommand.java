package com.agyo.skyblockitems;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemUI itemUI = new ItemUI();
            itemUI.displayItemUI(player);
        } else {
            System.out.println("Only Players can use this command!");
        }
        return false;
    }
}
