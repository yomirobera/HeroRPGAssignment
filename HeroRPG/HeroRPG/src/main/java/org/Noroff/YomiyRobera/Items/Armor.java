package org.Noroff.YomiyRobera.Items;

import org.Noroff.YomiyRobera.HeroAttribute;
import org.Noroff.YomiyRobera.Slot;

public class Armor extends Item {

    ArmorTypes ArmorType;
    public HeroAttribute armorAttribute;

    public Armor(String name, int requiredLevel, Slot slot, ArmorTypes armorType,
                 HeroAttribute armorAttribute) {
        super(name, requiredLevel, slot);
        ArmorType = armorType;
        this.armorAttribute = armorAttribute;
    }
}
