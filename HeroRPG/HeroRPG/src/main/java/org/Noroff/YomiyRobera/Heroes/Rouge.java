package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;


public class Rouge extends Hero {


    //Constructor
    public Rouge(String name) {

        super(name);
        LevelAttributes = new HeroAttribute(1,4,1);
    }

    protected void AttributeGain() {
        LevelAttributes.setStrength(LevelAttributes.getStrength()+1);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+4);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+1);
    }

}
