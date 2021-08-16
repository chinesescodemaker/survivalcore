package me.noat.survivalcore.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ConsoleLog implements Listener {

    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Bukkit.getServer().getConsoleSender().sendMessage("[SurvivalCore] - " + e.getPlayer().getName() + " : " + e.getMessage());
    }
}
