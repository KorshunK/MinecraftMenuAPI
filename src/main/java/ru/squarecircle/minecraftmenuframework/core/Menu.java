package ru.squarecircle.minecraftmenuframework.core;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;


public class Menu extends AbstractMenu {
    private Player owner = null;
    private int size;
    private String title = "Menu created with MinecraftMenuFramework";
    public Menu(Player owner, int size, String title) {
        this.owner = owner;
        this.size = size;
        this.title = title;
        create(owner, size, title);
    }
    public Menu(int size, String title) {
        this.size = size;
        this.title = title;
        create(size, title);
    }
    public Menu(int size) {
        this.size = size;
        create(size, "Menu created with MinecraftMenuFramework");
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void clear() {
        this.get().clear();
    }
    public boolean isEmpty() {
        return this.get().getContents() == null;
    }

    public void addItem(ItemStack itemStack) {
        this.get().addItem(itemStack);
    }

    public void setItem(int slot, ItemStack itemStack) {
        this.get().setItem(slot, itemStack);
    }

    public void removeItem(ItemStack itemStack) {
        this.get().remove(itemStack);
    }

    public void removeItem(int i) {
        this.get().remove(i);
    }

    public ItemStack getItem(int i) {
        return this.get().getItem(i);
    }

    public ItemStack[] getContents() {
        return this.get().getContents();
    }

    public ItemStack[] getArmorContents() {
        return this.getArmorContents();
    }

    public List<HumanEntity> getViewers() {
        return this.get().getViewers();
    }



    public Inventory get() {
        return Bukkit.createInventory(owner, size, title);
    }
}