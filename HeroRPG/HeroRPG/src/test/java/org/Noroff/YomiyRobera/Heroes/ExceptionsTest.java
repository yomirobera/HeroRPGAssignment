package org.Noroff.YomiyRobera.Heroes;

import org.Noroff.YomiyRobera.Enumerator.Slot;
import org.Noroff.YomiyRobera.Enumerator.WeaponTypes;
import org.Noroff.YomiyRobera.Items.Armor;
import org.Noroff.YomiyRobera.Items.Item;
import org.Noroff.YomiyRobera.Items.Weapon;
import org.junit.jupiter.api.Test;

import static org.Noroff.YomiyRobera.Enumerator.ArmorTypes.Plate;
import static org.Noroff.YomiyRobera.Enumerator.WeaponTypes.Axe;
import static org.Noroff.YomiyRobera.Enumerator.WeaponTypes.Wand;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionsTest {

    @Test
    void WeaponThrowExceptionTest() throws Hero.InvalidWeaponException {


        Warrior warrior =  new Warrior("Warrior");
        //Arrange
        String expected =" You are not the correct hero class for this weapon";
        //Act
        Exception exception = assertThrows(Hero.InvalidWeaponException.class,()-> {
            warrior.equipWeapon(Wand);});
            String actual = exception.getMessage();
            //Assert
            assertEquals(expected, actual);
    }

    @Test
    void ArmorThrowExceptionTest() throws Hero.InvalidArmorException {
        //Arrange
        Warrior warrior =  new Warrior("Warrior");
        String expected = "You are not the correct hero class for this Armor";
        //Act
        Exception exception = assertThrows(Hero.InvalidWeaponException.class,() ->{
            warrior.equipArmor(Plate);
        });
        String actual = exception.getMessage();
        //Assert
        assertEquals(expected, actual);
    }

}