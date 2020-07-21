package me.isnow.Essentials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.isnow.Essentials.commands.Gamemode;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
	    if(pm.getPlugin("Essentials") != null) {
	    	Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Snow's Essentials] Found Essentials, disabling it...");
	    	pm.disablePlugin(pm.getPlugin("Essentials"));
	    }
	    else {
		    RegisterEvents(pm);
		    RegisterCommands(pm);
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Snow's Essentials] Loaded!");
	    }
	}
	
	public void RegisterEvents(PluginManager pm) {
		
	}

	public void RegisterCommands(PluginManager pm) {
		this.getCommand("gamemode").setExecutor(new Gamemode());
	}
}
