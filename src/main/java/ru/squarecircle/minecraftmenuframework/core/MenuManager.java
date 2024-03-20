package ru.squarecircle.minecraftmenuframework.core;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class MenuManager {
    private static List<Menu> allMenus = new ArrayList<>();
    public static Menu create(int size, String title) {
        return createMenu(size, title);
    }
    public static Menu create(Player owner, int size, String title) {
        return createMenu(owner, size, title);
    }
    private static Menu createMenu(int size, String title) {
        Menu menu = new Menu(size, title);
        allMenus.add(menu);
        return menu;
    }
    private static Menu createMenu(Player owner, int size, String title) {
        Menu menu = new Menu(owner, size, title);
        allMenus.add(menu);
        return menu;
    }
    public static Menu castToMenu(Inventory inventory) {
        return new Menu(inventory.getSize(), inventory.getTitle());
    }

    public static Inventory castToInventory(Menu menu) {
        return Bukkit.createInventory(menu.getOwner(), menu.getSize(), menu.getTitle());
    }
    public static List<Menu> getAllMenus() {
        return allMenus;
    }
    public static void allMenusForEach(Consumer<? super Menu> action) {
        getAllMenus().forEach(action);
    }
}