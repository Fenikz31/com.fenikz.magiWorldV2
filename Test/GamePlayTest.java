import org.junit.jupiter.api.Test;
import playerClass.Player;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class GamePlayTest {


    @Test
    public void Given_ValidStats_When_StatsAsked_Then_DisplayValidationStats(int level, int force, int agility, int intelligence) {
        String[] output = outContent.toString().replace("\r\n", "\n").split("\n");
        askPlayerStats(50,35,10,5);
        assertEquals("Le niveau est bien égale à la somme de la force, l'agilité et de l'intelligence\n",output[50]);
    }

    @Test
    public void Given_TooHighStats_When_StatsAsked_Then_DisplayTooHighStats(int level, int force, int agility, int intelligence) {
        level = force + agility + intelligence;
        askPlayerStats(50,35,10,5);
        assertEquals( 50, askPlayerStats(50,35,10,5),"Le niveau n'est pas égale à la somme de la force, l'agilité et de l'intelligence\n");
    }

    @Test
    protected int askPlayerStats(int level, int force, int agility, int intelligence) {
        return Integer.parseInt(null);
    }

    @Test
    void creation() {
    }

    @Test
    void askName() {
    }
}