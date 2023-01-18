package org.Noroff.YomiyRobera;

//This class is Encapsulation of the HeroAttributes when leveling up
public class HeroAttribute {

    private int strength;
    private int Dexterity;
    private int Intelligence;

    //Constructor
    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.Dexterity = dexterity;
        this.Intelligence = intelligence;
    }

    //Getters and setters
    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {

        this.strength = strength;
    }

    public int getDexterity() {

        return Dexterity;
    }

    public void setDexterity(int dexterity) {

        this.Dexterity = dexterity;
    }

    public int getIntelligence() {

        return Intelligence;
    }

    public void setIntelligence(int intelligence) {

        this.Intelligence = intelligence;
    }


}
