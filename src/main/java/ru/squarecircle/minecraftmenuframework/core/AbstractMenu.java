package ru.squarecircle.minecraftmenuframework.core;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public abstract class AbstractMenu {
    protected static void create(int size, String title) {
        createMenu(title, size);
    }
    protected static void create(Player owner, int size, String title) {
        createMenu(owner, size, title);
    }
    private static void createMenu(String title, int size) {
        Bukkit.createInventory(null, size, title);
    }
    private static void createMenu(Player owner, int size, String title) {
        Bukkit.createInventory(owner, size, title);
    }
}
