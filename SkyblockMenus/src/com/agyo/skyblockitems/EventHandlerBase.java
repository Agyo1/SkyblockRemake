package com.agyo.skyblockitems;

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
        System.out.println("Calculating sword damage");
        StoreOwner storeOwner = new StoreOwner();
        storeOwner.getSwordDamage(player);
    }

//    @EventHandler
//    public void onInventory(InventoryOpenEvent ioe) {
//        HumanEntity he = ioe.getPlayer();
//        //String event = pihe.getEventName();
//        System.out.println("inventory check");
//        System.out.println(event);
//        if (event.equals(""))
//        ItemDisplay id = new ItemDisplay();
//        System.out.println("Getting and displaying items");
//        id.displayItems(player);
//  }

//    @EventHandler
//    public void onInventoryOpen(InventoryOpenEvent event) {
//        ItemStack[] contents = event.getInventory().getContents();
//        for (int i = 0; i < contents.length; i++) {
//            System.out.println("Contents: " + contents.toString());
//        }
//    }
}
