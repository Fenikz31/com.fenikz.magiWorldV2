import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import playerClass.Mage;
import playerClass.Player;
import playerClass.Warrior;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GamePlayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private List<Player> playerList = new ArrayList<>();
    private int sum = 0;
    int i;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    /**
     * Test of player's creation
     */
    @Test
    public void testCreation() {
        System.out.println("test de la création du joueur");

        playerList.add(new Warrior(50,35, 10, 5, "Guerrier"));
        // sum force, agility and intelligence
        // test if the sum equals level

    }


}