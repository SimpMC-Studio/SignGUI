package de.rapha149.signgui;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main plugin class for SignGUI when loaded as a standalone Bukkit/Paper plugin.
 * Other plugins can depend on this plugin and use the SignGUI API directly.
 */
public class SignGUIPlugin extends JavaPlugin {

    private static SignGUIPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("SignGUI v" + getDescription().getVersion() + " enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("SignGUI disabled.");
        instance = null;
    }

    public static SignGUIPlugin getInstance() {
        return instance;
    }
}
