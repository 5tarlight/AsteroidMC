package com.yeahx4.github.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Asteroid extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Asteroid is coming!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Asteroid is disappearing");
    }
}
