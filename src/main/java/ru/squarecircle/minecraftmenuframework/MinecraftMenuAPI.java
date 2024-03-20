package ru.squarecircle.minecraftmenuframework;

import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftMenuAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Framework enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Framework disabled!");
    }
}