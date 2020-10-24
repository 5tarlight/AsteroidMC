package com.yeahx4.github.plugin.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public final class Logger {
    public static void log(String msg) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Asteroid] " + ChatColor.RESET + msg);
    }
}
