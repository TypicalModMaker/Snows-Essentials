package me.isnow.Essentials.commands;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.ChatColor;


public class Gamemode implements CommandExecutor
{
	@Override
    public boolean onCommand(final CommandSender sender, final Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (!sender.hasPermission("Snow.gamemode")) {
                sender.sendMessage(ChatColor.RED + "Sorry, you cannot perform this command.");
                return true;
            }
            if(args.length == 0){
                return false;
            }
            if (args[0].equals("creative") || args[0].equals("1")) {
                if(args.length > 1) 
                {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        target.setGameMode(GameMode.CREATIVE);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to creative!");
                        return true;
                    }
                    sender.sendMessage(ChatColor.RED + "Player " + args[1] + " Does not exist!");
                }
                else {
                	((Player) sender).setGameMode(GameMode.CREATIVE);
                	sender.sendMessage(ChatColor.GREEN + "Successfully set your gamemode to creative!");
                }
            }
        
        }
        else {
            sender.sendMessage(ChatColor.RED + "Sorry, console can't execute this command.");
        }
        return false;
    }
}
