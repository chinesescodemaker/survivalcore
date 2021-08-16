package me.noat.survivalcore.welcomeleave;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class WelcomeLeave implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        String playerName = e.getPlayer().getName();
        e.setQuitMessage(ChatColor.RED + "[-] " + playerName + " had left the server.");
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String playerName = e.getPlayer().getName();
        e.setJoinMessage(ChatColor.GREEN + "[+] " + playerName + " had join the server.");
    }
}
