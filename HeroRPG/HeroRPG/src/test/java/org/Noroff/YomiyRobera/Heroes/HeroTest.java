package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.Enumerator.Slot;
import org.Noroff.YomiyRobera.Items.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void HeroClassWarriorNameTest() {
        Warrior warrior =  new Warrior("Warrior");
        String actual = warrior.getName();
        String expected = "Warrior";
        assertEquals(expected,actual);
    }

    @Test
    void HeroClassWarriorLevelTest(){
        Warrior warrior =  new Warrior("Warrior");
        int actual = warrior.getLevel();
        int expected = 1;
        assertEquals(expected, actual);
    }



    //Most of the testing was done in Main class.

    /*
    //Testing if Mage hero class can level up to 200
    @Test
    void LevelingUpWarriorClassTest() {

        Warrior warrior =  new Warrior("Warrior");
        warrior.getLevel();
        int expected = 200;
        for (int actual = 0; actual < 200; actual++) {
            warrior.LevelUp();
        }
        assertEquals(expected, 20);
    }
    */


}