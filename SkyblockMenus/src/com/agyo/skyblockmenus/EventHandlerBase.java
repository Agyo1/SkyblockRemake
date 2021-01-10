package com.agyo.skyblockmenus;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventHandlerBase implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent pje) {
        Player player = pje.getPlayer();
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        System.out.println("Generating and sending welcome message");
        welcomeMessage.generateAndSendWelcomeMessage(player);
    }
}
