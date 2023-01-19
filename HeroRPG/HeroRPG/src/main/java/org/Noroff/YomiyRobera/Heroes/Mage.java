package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;


//  Class that extends from Hero
public class Mage extends Hero {
    //Constructor
    public Mage(String Name) {
        super(Name);
        LevelAttributes.setStrength(1);
        LevelAttributes.setDexterity(1);
        LevelAttributes.setIntelligence(8);
    }

    protected void AttributeGain() {
        //Every time a Mage levels up
        LevelAttributes.setStrength(LevelAttributes.getStrength()+1);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+1);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+5);
    }
}

