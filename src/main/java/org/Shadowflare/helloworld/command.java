package org.Shadowflare.helloworld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class command extends JavaPlugin {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.GOLD + "Hello, " + ChatColor.AQUA + "world!");
        return true;
    }
}