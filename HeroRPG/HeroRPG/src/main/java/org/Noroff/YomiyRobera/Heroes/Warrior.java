package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;


public class Warrior extends Hero {


    public Warrior(String name) {

        super(name);
        LevelAttributes = new HeroAttribute(5,2,1);
    }
    protected void AttributeGain() {
        LevelAttributes.setStrength(LevelAttributes.getStrength()+3);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+2);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+1);
    }
}
