package com.yeahx4.github.plugin.commands.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class AsteroidCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        sender.sendMessage(ChatColor.YELLOW + "======================================");
        sender.sendMessage(ChatColor.YELLOW + "Plugin: Asteroid");
        sender.sendMessage(ChatColor.YELLOW + "Description: Asteroid game plugin");
        sender.sendMessage(ChatColor.YELLOW + "Author: YEAHx4#9662");
        sender.sendMessage(ChatColor.YELLOW + "======================================");

        return true;
    }
}
