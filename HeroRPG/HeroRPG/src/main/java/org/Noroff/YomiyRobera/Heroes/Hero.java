package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.Enumerator.ArmorTypes;
import org.Noroff.YomiyRobera.Enumerator.WeaponTypes;
import org.Noroff.YomiyRobera.HeroAttribute;
import org.Noroff.YomiyRobera.Items.*;
import org.Noroff.YomiyRobera.Enumerator.Slot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//This class is abstract with a shared functions Mage, Ranger, Rouge and Warrior.
abstract class Hero {

    public String Name;
    public int Level;
    public HeroAttribute LevelAttributes = new HeroAttribute(0, 0,0);
    public HashMap<Slot,Item> Equipment = new HashMap<Slot,Item>();
    public ArrayList<WeaponTypes> validWeaponTypes = new ArrayList<WeaponTypes>();
    public ArrayList<ArmorTypes> validArmorTypes = new ArrayList<ArmorTypes>();

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

        int total = getLevel() + intelligence + strength + dexterity;

        //Integrating HashMap through for loop
        for(Map.Entry<Slot,Item> set : Equipment.entrySet()) {
            if(set.getKey().equals(Slot.Weapon)) {
                continue;
            }
            Armor armor = (Armor) set.getValue();

            HeroAttribute armorAtt = armor.armorAttribute;

            int intelligence2 = armorAtt.getIntelligence();
            int strength2 = armorAtt.getStrength();
            int dexterity2 = armorAtt.getDexterity();

            total = total + intelligence2 + strength2 + dexterity2;

        }
        return total;
    }

    //Method that shows InvalidWeaponException, check if it is required level and the right weapon type
    public class InvalidWeaponException extends RuntimeException {
        public InvalidWeaponException(String message, Throwable err) {

            super(message, err);
        }
    }
    public void equipWeapon(Weapon weapon, WeaponTypes weapontype) throws InvalidWeaponException {
        try {
            if(getLevel() < weapon.getRequiredLevel()) {
                throw new Exception("You don't have the required level to equip weapon");
            }

            if(!validWeaponTypes.contains(weapontype)){
                throw new Exception("Wrong type of Weapon for this Hero class");
            }
            Equipment.put(Slot.Weapon,weapon);

        } catch(Exception err) {
            throw new InvalidWeaponException("", err);
        }
    }

    //Method that shows InvalidArmorException, check if it is required level and the right armor type
    public class InvalidArmorException extends RuntimeException {
        public InvalidArmorException(String message, Throwable err) {

            super (message, err);
        }
    }
    public void equipArmor(Armor armor, ArmorTypes armorType, Slot slotType) throws InvalidArmorException {
       try {
           if (getLevel() > armor.getRequiredLevel()) {
               throw new Exception("You don't have the required level to equip this armor");
           }
           if (!validArmorTypes.contains(armorType)){
               throw new Exception("Wrong type of armor for this Hero class");
           }
           Equipment.put(slotType,armor);

       } catch (Exception err) {
           throw new InvalidArmorException("", err);
       }
    }

    //This function is not fully complete
    public String equipWeapon(WeaponTypes Weapon) {
        return null;
    }
    public String equipArmor(ArmorTypes Weapon) {
        return null;
    }

    public void display() {
        System.out.println("Name: " +getName());
        System.out.println("Level:"+getLevel());
        System.out.println("Total Attributes:" + totalAttributes());
        System.out.println("Current status: "+ "Strength: "
                + LevelAttributes.getStrength()+ " Dexterity "+LevelAttributes.getDexterity()
                + " Intelligence: "+LevelAttributes.getIntelligence());
    }
}
