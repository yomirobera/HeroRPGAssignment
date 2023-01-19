package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;

public class Ranger extends Hero {

    //Constructor
    public Ranger(String Name) {
        super(Name);
        //Base stat for Ranger
        LevelAttributes.setStrength(1);
        LevelAttributes.setDexterity(7);
        LevelAttributes.setIntelligence(1);
    }

    protected void AttributeGain() {
        //Every time a Ranger levels up
        LevelAttributes.setStrength(LevelAttributes.getStrength()+1);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+5);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+1);
    }
}
