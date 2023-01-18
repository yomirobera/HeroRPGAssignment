package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;

public class Ranger extends Hero {


    public Ranger(String Name) {
        super(Name);
        LevelAttributes = new HeroAttribute(1,7,1);
    }
    protected void AttributeGain() {
        LevelAttributes.setStrength(LevelAttributes.getStrength()+1);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+5);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+1);
    }


}
