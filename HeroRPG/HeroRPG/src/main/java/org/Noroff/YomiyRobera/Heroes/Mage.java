package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;


//  Class that extends from Hero
public class Mage extends Hero {

    //Constructor
    public Mage(String Name) {
        super(Name);
        LevelAttributes = new HeroAttribute(1,1,8);
    }

    protected void AttributeGain() {
        LevelAttributes.setStrength(LevelAttributes.getStrength()+1);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+1);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+5);
    }
}

