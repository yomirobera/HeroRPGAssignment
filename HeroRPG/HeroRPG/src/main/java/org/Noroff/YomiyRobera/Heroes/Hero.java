package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;
import org.Noroff.YomiyRobera.Items.*;
import org.Noroff.YomiyRobera.Slot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//This class is abstract with a shared functions Mage, Ranger, Rouge and Warrior.
abstract class Hero {

    public String Name;
    public int Level;
    public HeroAttribute LevelAttributes;
    public HashMap<Slot,Item> Equipment;
    public ArrayList<WeaponTypes> validWeaponTypes;

    //Static???
    public static ArrayList<ArmorTypes> validArmorTypes;




    //Constructor
    public Hero(String Name) {
        this.Name = Name;
    }

    //Leveling up a hero
    protected abstract void AttributeGain();
    public void LevelUp() {

        Level++;
        //Hero leveling up method based on the child class
        AttributeGain();
    }

    //Getter for Name, Level and Hero attribute
    public String getName() {

        return Name;
    }

    public int getLevel() {

        return Level;
    }

    //Total Attribute functionality
    public int totalAttributes() {
        int intelligence = LevelAttributes.getIntelligence();
        int strength = LevelAttributes.getStrength();
        int dexterity = LevelAttributes.getDexterity();

        int total = intelligence + strength + dexterity;

        //Integrating HashMap through for loop
        for(Map.Entry<Slot,Item> set : Equipment.entrySet()) {
            if(set.getKey().equals(Slot.Weapon)) {
                continue;
            }
            Armor armor = (Armor) set.getValue();

            HeroAttribute armorAtt = armor.armorAttribute;

            intelligence = armorAtt.getIntelligence();
            strength = armorAtt.getStrength();
            dexterity = armorAtt.getDexterity();

            total += intelligence + strength + dexterity;

        }
        return total;
    }




    //Method that shows InvalidWeaponException, check if it is required level and the right weapon type
    public class InvalidWeaponException extends Exception {
        public InvalidWeaponException(String message) {

            super(message);
        }
    }
    public void equipWeapon(Weapon weapon, WeaponTypes weapontype) throws InvalidWeaponException {
        if(getLevel() > weapon.getRequiredLevel()) {
            throw new InvalidWeaponException("You don't have the required level to equip weapon");
        }

        if(!validWeaponTypes.contains(weapontype)){
            throw new InvalidWeaponException("Wrong type of Weapon for this Hero class");
        }
    }

    //Method that shows InvalidArmorException, check if it is required level and the right armor type
    public class InvalidArmorException extends Exception {
        public InvalidArmorException(String message) {
            super(message);
        }
    }

    public void equipArmor(Armor armor, ArmorTypes armorType) throws InvalidArmorException {
        if (getLevel() > armor.getRequiredLevel()) {
            throw new InvalidArmorException("You don't have the required level to equip this armor");
        }
        if (!validArmorTypes.contains(armorType)){
            throw new InvalidArmorException("Wrong type of armor for this Hero class");
        }
    }

    public void display() {
        System.out.println("Name: " +getName()+" Level: " +getLevel());
        System.out.println("Total Attributes: " + totalAttributes());
        System.out.println("After leveling up once: "+ "Strength: "
                + LevelAttributes.getStrength()+ " Dexterity "+LevelAttributes.getDexterity()
                + " Intelligence: "+LevelAttributes.getIntelligence());
    }
}
