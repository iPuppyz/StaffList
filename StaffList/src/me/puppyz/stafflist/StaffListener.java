package me.puppyz.stafflist;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class StaffListener implements Listener {
	
	@EventHandler
	public void staffLogin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		 if(player.hasPermission("stafflist.list")) {
			Main.staff.add(name);
		}
	}
	
	@EventHandler
	public void staffLogout(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		if(Main.staff.contains(name)) {
			Main.staff.remove(name);
		}
	}

}
