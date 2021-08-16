package me.noat.survivalcore.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class IhavEyesMermaidEvent implements Listener {
    // god tier chinese
    @EventHandler
    public void onPlayer(PlayerEvent e) {
        if (e.getPlayer().getName().equalsIgnoreCase("IhavEyes")) {
            int x = e.getPlayer().getLocation().getBlockX();
            int y = e.getPlayer().getLocation().getBlockY();
            int z = e.getPlayer().getLocation().getBlockZ();
            Block b = e.getPlayer().getWorld().getBlockAt(x, y, z);
            if (b.getType() != Material.WATER) {
                e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.POISON, 5, 2));
            } else {
                e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, 100000, 1));
            }
        }
    }
}
