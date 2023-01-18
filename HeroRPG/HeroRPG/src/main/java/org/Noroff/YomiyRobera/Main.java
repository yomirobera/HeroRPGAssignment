package org.Noroff.YomiyRobera;

import org.Noroff.YomiyRobera.Heroes.*;
import org.Noroff.YomiyRobera.Items.ArmorTypes;
import org.Noroff.YomiyRobera.Items.WeaponTypes;
import org.Noroff.YomiyRobera.Items.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<WeaponTypes> validWeaponTypes = new ArrayList<WeaponTypes>();
        //ArrayList<ArmorTypes> validArmorTypes = new ArrayList<ArmorTypes>();
        //Heroes

        //Displaying Mage class
        Mage mage =  new Mage("Mage");
        mage.display();
        //Valid weapon type for Mage.
        validWeaponTypes.add(WeaponTypes.Staff);
        validWeaponTypes.add(WeaponTypes.Wand);

        mage.validWeaponTypes = validWeaponTypes;
        //Total Attributes
        int num = mage.totalAttributes();
        /*-------------------------------------_-----*/

        //Displaying Ranger class
        Ranger ranger =  new Ranger("Ranger");
        ranger.display();
        //Valid weapon type for Mage.
        validWeaponTypes.add(WeaponTypes.Bow);
        ranger.validWeaponTypes = validWeaponTypes;
        //Total Attributes
        int num2 = ranger.totalAttributes();
        /*------------------------------------------*/

        //Displaying Ranger class
        Rouge rouge =  new Rouge("Rouge");
        rouge.display();
        //Valid weapon type for Mage.
        validWeaponTypes.add(WeaponTypes.Dagger);
        validWeaponTypes.add(WeaponTypes.Sword);
        rouge.validWeaponTypes = validWeaponTypes;
        //Total Attributes
        int num3 = rouge.totalAttributes();
        /*------------------------------------------*/

        //Displaying Ranger class
        Warrior warrior =  new Warrior("Warrior");
        warrior.display();
        //Valid weapon type for Mage.
        validWeaponTypes.add(WeaponTypes.Axe);
        validWeaponTypes.add(WeaponTypes.Hammer);
        validWeaponTypes.add(WeaponTypes.Sword);
        warrior.validWeaponTypes = validWeaponTypes;
        //Total Attributes
        int num4 = rouge.totalAttributes();
        /*------------------------------------------*/

        //Heroes leveling up
        mage.LevelUp();
        ranger.LevelUp();
        rouge.LevelUp();
        warrior.LevelUp();

    }
}