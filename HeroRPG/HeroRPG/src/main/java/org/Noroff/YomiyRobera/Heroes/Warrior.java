package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.HeroAttribute;


public class Warrior extends Hero {

    public Warrior(String Name) {
        super(Name);
        LevelAttributes.setStrength(5);
        LevelAttributes.setDexterity(2);
        LevelAttributes.setIntelligence(1);
    }

    protected void AttributeGain() {
        //Every time a Warrior levels up
        LevelAttributes.setStrength(LevelAttributes.getStrength()+3);
        LevelAttributes.setDexterity(LevelAttributes.getDexterity()+2);
        LevelAttributes.setIntelligence(LevelAttributes.getIntelligence()+1);
    }
}
