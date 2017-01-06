package me.puppyz.stafflist;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
      public static ArrayList<String> staff = new ArrayList<String>();
      
      public void onEnable() {
    	  this.getServer().getPluginManager().registerEvents(new StaffListener(), this);
    	  this.getCommand("staff").setExecutor(new StaffCommand());
      }
}
