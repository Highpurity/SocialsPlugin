package highpurity.cc.socials.plugin.highpurity.cc.Highpurity.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Discord implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {
            if (args.length == 1) {
                var user = Bukkit.getPlayer(args[0]);
                var display = user.getDisplayName();
                if(user != null){
                    p.sendMessage(ChatColor.YELLOW + display + ChatColor.WHITE + "'s Discord:");
                    p.sendMessage("Discord!");
                }

            }else-if(args.length == 2){
                p.getUniqueId();
                

                var social = args[1];
            }
        }


        return true;
    }
}
