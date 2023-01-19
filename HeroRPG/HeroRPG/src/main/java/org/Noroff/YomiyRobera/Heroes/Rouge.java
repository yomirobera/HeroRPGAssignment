package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;


public class Rouge extends Hero {

    //Constructor
    public Rouge(String Name) {
        super(Name);
        LevelAttributes.setStrength(2);
        LevelAttributes.setDexterity(6);
        LevelAttributes.setIntelligence(1);
    }

    protected void AttributeGain() {
        //Every time a Rouge levels up
        LevelAttributes.setStrength(LevelAttributes.getStrength()+1);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+4);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+1);
    }
}
