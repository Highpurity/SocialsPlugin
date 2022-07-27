package highpurity.cc.socials.plugin.highpurity.cc.Highpurity;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class cc extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        var logger = getLogger();
        logger.info("Starting SocialsPlugin!");

        getConfig();
        saveDefaultConfig();


        logger.info("SocialsPlugin has started!");

    }
    
}
