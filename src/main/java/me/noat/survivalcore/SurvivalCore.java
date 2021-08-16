package me.noat.survivalcore;

import me.noat.survivalcore.commands.Commands;
import me.noat.survivalcore.events.ConsoleLog;
import me.noat.survivalcore.events.IhavEyesMermaidEvent;
import me.noat.survivalcore.welcomeleave.WelcomeLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("bed").setExecutor(new Commands());
        getCommand("help").setExecutor(new Commands());
        getCommand("coords").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new WelcomeLeave(), this);
        getServer().getPluginManager().registerEvents(new IhavEyesMermaidEvent(), this);
        getServer().getPluginManager().registerEvents(new ConsoleLog(), this);
        getServer().getConsoleSender().sendMessage("hi, we gaming :sunglasses: (plugin started)");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logicx
        getServer().getConsoleSender().sendMessage("hi, we aint gaming :sob: (plugin stopped)");
    }
}
