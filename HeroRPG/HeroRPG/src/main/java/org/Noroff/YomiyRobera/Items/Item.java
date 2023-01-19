package org.Noroff.YomiyRobera.Items;

import org.Noroff.YomiyRobera.Enumerator.Slot;

//Item class
public abstract class Item {

    String name;
    int RequiredLevel;
    Slot slot;

    //Constructor
    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.RequiredLevel = requiredLevel;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public int getRequiredLevel() {

        return RequiredLevel;
    }
    public Slot getSlot() {

        return slot;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", RequiredLevel=" + RequiredLevel +
                ", slot=" + slot +
                '}';
    }
}
