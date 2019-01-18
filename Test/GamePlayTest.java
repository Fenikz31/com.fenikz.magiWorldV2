import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import playerClass.Mage;
import playerClass.Warrior;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class GamePlayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private int sum = 0;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(System.out);
    }

    /**
     * Test of player's creation
     */
    @Test
    void positiveTestCreation() {
        System.out.println("test de la création du joueur");
        Warrior testWarrior = new Warrior(50,35,15,0,"Guerrier");
        sum = testWarrior.getForce() + testWarrior.getIntelligence() + testWarrior.getAgility();// sum force, agility and intelligence
        if (sum != testWarrior.getLevel()) {
            System.out.println("La somme de la force, de l'intelligence et de la agilité est différent du niveau");
        }
        else { System.out.println("La somme de la force, de l'intelligence et de la agilité est égale au niveau");
        }
    }

    @Test
    void negativeTestCreation() {
        Mage testMage = new Mage(20,50,10,45,"Mage");
        sum = testMage.getForce() + testMage.getIntelligence() + testMage.getAgility();
        if (sum != testMage.getLevel()) {
            System.out.println("La somme de la force, de l'intelligence et de la agilité est égale au niveau");
        }
        else { System.out.println("La somme de la force, de l'intelligence et de la agilité est différent du niveau");
        }
    }
}