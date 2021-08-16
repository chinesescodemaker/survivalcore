package me.noat.survivalcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("bed")) {
                Player player = (((Player) sender).getPlayer());
                if (player.getBedSpawnLocation() != null) {
                    player.teleport(player.getBedSpawnLocation());
                } else {
                    player.sendMessage("You don't have your bed set up!");
                }
            }
            if (command.getName().equalsIgnoreCase("coords")) {
                Player player = (Player) sender;
                int x = player.getLocation().getBlockX();
                int y = player.getLocation().getBlockY();
                int z = player.getLocation().getBlockZ();
                player.sendMessage("Your coords are: ");
                player.sendMessage("X: " + x);
                player.sendMessage("Y: " + y);
                player.sendMessage("Z: " + z);
            }
            if (command.getName().equalsIgnoreCase("help")) {
                Player player = (((Player) sender).getPlayer());
                player.sendMessage("/bed - TP'd to your bed.");
                player.sendMessage("/coords - Send your coords");
            }
        }
        return true;
    }
}
