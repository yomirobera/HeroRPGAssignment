package org.Noroff.YomiyRobera.Items;

//Method that shows InvalidWeaponException if wrong weapon is equipped


import org.Noroff.YomiyRobera.Enumerator.WeaponTypes;
import org.Noroff.YomiyRobera.Enumerator.Slot;

public class Weapon extends Item {

    WeaponTypes weapon;

    public Weapon(String name, int requiredLevel, Slot slot) {

        super(name, requiredLevel, slot);
    }

    //Getter for weapon
    public WeaponTypes getWeapon(){

        return weapon;
    }

}
