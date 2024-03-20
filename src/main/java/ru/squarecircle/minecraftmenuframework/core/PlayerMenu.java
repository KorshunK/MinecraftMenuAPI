package ru.squarecircle.minecraftmenuframework.core;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerMenu {
    public static void openFor(Player player, Menu menu) {
        player.openInventory(menu.get());
    }
    public static void closeViewFor(Player player) {
        player.getOpenInventory().close();
    }
    public static void updateViewFor(Player player) {
        player.updateInventory();
    }
}