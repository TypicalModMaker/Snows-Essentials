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
        	String s = "test";
            if (!sender.hasPermission("snow.gamemode")) {
                sender.sendMessage(ChatColor.RED + "Sorry, you cannot perform this command.");
                return true;
            }
            if(args.length == 0){
            	sender.sendMessage("Usage: /gamemode [player] [gamemode] OR: /gamemode [gamemode] [player]");
                return true;
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
                    return true;
                }
                else {
                	((Player) sender).setGameMode(GameMode.CREATIVE);
                	sender.sendMessage(ChatColor.GREEN + "Successfully set your gamemode to creative!");
                    return true;
                }
            }
            if (args[0].equals("survival") || args[0].equals("0")) {
                if(args.length > 1) 
                {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        target.setGameMode(GameMode.SURVIVAL);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to survival!");
                        return true;
                    }
                    sender.sendMessage(ChatColor.RED + "Player " + args[1] + " Does not exist!");
                    return true;
                }
                else {
                	((Player) sender).setGameMode(GameMode.SURVIVAL);
                	sender.sendMessage(ChatColor.GREEN + "Successfully set your gamemode to survival!");
                    return true;
                }
            }
            if (args[0].equals("adventure") || args[0].equals("2")) {
                if(args.length > 1) 
                {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        target.setGameMode(GameMode.ADVENTURE);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to adventure!");
                        return true;
                    }
                    sender.sendMessage(ChatColor.RED + "Player " + args[1] + " Does not exist!");
                    return true;
                }
                else {
                	((Player) sender).setGameMode(GameMode.ADVENTURE);
                	sender.sendMessage(ChatColor.GREEN + "Successfully set your gamemode to adventure!");
                    return true;
                }
            }
            if (args[0].equals("spectator") || args[0].equals("3")) {
                if(args.length > 1) 
                {
                    Player target = Bukkit.getPlayer(args[1]);
                    if (target != null) {
                        target.setGameMode(GameMode.SPECTATOR);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to spectator!");
                        return true;
                    }
                    sender.sendMessage(ChatColor.RED + "Player " + args[1] + " Does not exist!");
                    return true;
                }
                else {
                	((Player) sender).setGameMode(GameMode.SPECTATOR);
                	sender.sendMessage(ChatColor.GREEN + "Successfully set your gamemode to spectator!");
                    return true;
                }
            }
            Player target = Bukkit.getPlayer(args[0]);
            if(target != null) {
            	if(args.length > 1) {
                    if (args[1].equals("spectator") || args[1].equals("3")) {
                        target.setGameMode(GameMode.SPECTATOR);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to spectator!");
                        return true;
                    }
                    if (args[1].equals("creative") || args[1].equals("1")) {
                        target.setGameMode(GameMode.CREATIVE);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to creative!");
                        return true;
                    }
                    if (args[1].equals("adventure") || args[1].equals("2")) {
                        target.setGameMode(GameMode.ADVENTURE);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to adventure!");
                        return true;
                    }
                    if (args[1].equals("survival") || args[1].equals("0")) {
                        target.setGameMode(GameMode.SURVIVAL);
                        sender.sendMessage(ChatColor.GREEN + "Successfully set " + target.getName() + "'s gamemode to survival!");
                        return true;
                    }
                    return true;
            	}
                else if(args.length == 1) {
                	sender.sendMessage("Usage: /gamemode [player] [gamemode] OR: /gamemode [gamemode] [player]");
                	return true;
                }
            }
            else if(target == null){
            	sender.sendMessage(ChatColor.RED + "Player " + args[1] + " Does not exist!");
            	return true;
            }
        }
        else {
            sender.sendMessage(ChatColor.RED + "Sorry, console can't execute this command.");
            return true;
        }
		return false;
    }
}
