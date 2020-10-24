package com.yeahx4.github.plugin;

import com.yeahx4.github.plugin.utils.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class Asteroid extends JavaPlugin {
    @Override
    public void onEnable() {
        Logger.log("Asteroid enabled. Watch your back");
    }

    @Override
    public void onDisable() {
        Logger.log("Asteroid disabled. Bye");
    }
}
