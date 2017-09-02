package zeprof.defiuhc;

import org.bukkit.plugin.java.JavaPlugin;
import zeprof.defiuhc.listener.PlayerConnectionListener;

public final class Defiuhc extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerConnectionListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
