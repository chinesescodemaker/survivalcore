package me.noat.survivalcore.events;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathCoords implements Listener {
    public static int deathX;
    public static int deathY;
    public static int deathZ;
    public static Location deathCoords;
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        deathCoords = e.getEntity().getLocation();
        int deathX = deathCoords.getBlockX();
        int deathY = deathCoords.getBlockY();
        int deathZ = deathCoords.getBlockZ();

        e.getEntity().sendMessage("You've died at " + deathX + ", " + deathY + ", " + deathZ);
    }
}