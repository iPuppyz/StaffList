package me.puppyz.stafflist;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player && args.length == 0) {
			Player player = (Player) sender;
			StringBuilder stringbuilder = new StringBuilder();
			for(String name : Main.staff) {
		    if(Main.staff.isEmpty()) {
		    	sender.sendMessage(ChatColor.DARK_RED + "No staff online!");
		    	return true;
		    }
				stringbuilder.append(name + ", ");
			}
			player.sendMessage(ChatColor.GREEN + "Staff Online: " + stringbuilder.toString());
		}
		return false;
	}	

}
