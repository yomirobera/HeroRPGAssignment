package org.Noroff.YomiyRobera;

import org.Noroff.YomiyRobera.Enumerator.Slot;
import org.Noroff.YomiyRobera.Heroes.*;
import org.Noroff.YomiyRobera.Enumerator.ArmorTypes;
import org.Noroff.YomiyRobera.Items.Weapon;
import org.Noroff.YomiyRobera.Enumerator.WeaponTypes;


public class Main {
    public static void main(String[] args) {

        //Heroes

        //Displaying Mage class
        Mage mage =  new Mage("Mage");
        mage.display();
        //Valid weapon type for Mage.
        mage.validWeaponTypes.add(WeaponTypes.Staff);
        mage.validWeaponTypes.add(WeaponTypes.Wand);
        //Valid type of armor for Mage*/
        mage.validArmorTypes.add(ArmorTypes.Cloth);

        //Total Attributes
        int num = mage.totalAttributes();
        /*-------------------------------------------*/
        //Mage leveling up
        for(int i = 0; i < 200; i++) {
            mage.LevelUp();
        }
        mage.display();
        //Equip weapon after leveling up. This is to avoid Exception error.
        Weapon staff= new Weapon("greatSword", 200, Slot.Body);
        mage.equipWeapon(staff, WeaponTypes.Staff);
        /*-------------------------------------------*/

        //Displaying Ranger class
        System.out.println("________________");
        Ranger ranger =  new Ranger("Ranger");
        ranger.display();
        //Valid weapon type for Mage.
        ranger.validWeaponTypes.add(WeaponTypes.Bow);
        //Valid type of armor for Mage*/
        ranger.validArmorTypes.add(ArmorTypes.Leather);
        ranger.validArmorTypes.add(ArmorTypes.Mail);
        /*___________________________*/

        //Displaying Rouge class
        System.out.println("________________");
        Rouge rouge =  new Rouge("Rouge");
        rouge.display();
        //Valid weapon type for Mage.
        rouge.validWeaponTypes.add(WeaponTypes.Dagger);
        rouge.validWeaponTypes.add(WeaponTypes.Sword);
        //Valid type of armor for Mage*/
        rouge.validArmorTypes.add(ArmorTypes.Leather);
        rouge.validArmorTypes.add(ArmorTypes.Mail);
        /*___________________________*/

        //Displaying Warrior class
        System.out.println("________________");
        Warrior warrior =  new Warrior("Rouge");
        warrior.display();
        //Valid weapon type for Mage.
        warrior.validWeaponTypes.add(WeaponTypes.Axe);
        warrior.validWeaponTypes.add(WeaponTypes.Hammer);
        warrior.validWeaponTypes.add(WeaponTypes.Sword);
        //Valid type of armor for Mage*/
        warrior.validArmorTypes.add(ArmorTypes.Mail);
        warrior.validArmorTypes.add(ArmorTypes.Plate);
        /*___________________________*/
    }

}