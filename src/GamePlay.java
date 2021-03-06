import playerClass.Mage;
import playerClass.Player;
import playerClass.Prowler;
import playerClass.Warrior;

import java.util.Scanner;

class GamePlay {

    private final static String classType = "Veuillez choisir la classe de votre joueur (1: Warrior, 2: Rôdeur, 3: Mage)";
    private final static String askStats = " du joueur ?";

    //Stats at -1 to avoid stats < 0
    private int playerClass, level, force, intelligence, agility = -1;


    /**
     * stats input unless int < min or int > max
     */
    void askPlayerStats(){
        int maxPlayerClass = 3;
        int minPlayerClass = 1;
        int maxLevel = 100;
        int minLevel = 1;
        int charStats = 0;

        playerClass = numInput(minPlayerClass, maxPlayerClass, classType);
        level = numInput(minLevel, maxLevel, "Niveau" + askStats);
        force = numInput(charStats, level, "Force" + askStats);
        intelligence = numInput(charStats, level - force, "Intelligence" + askStats);
        agility = numInput(charStats, level - force - intelligence, "Agilité" + askStats);
    }



    /**
     * Ask input between min and max
     * until it's ok
     * @param min self explanatory
     * @param max self explanatory
     * @param question self explanatory
     * @return player's choice
     */
    private int numInput(int min, int max, String question){
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice < min || choice > max) {
            System.out.println(question);
            choice = scanner.nextInt(); }
        return choice;
    }




    /**
     * Run player's creation
     *
     * @param name self explanatory
     * @return player
     */
    Player creation(String name){
        //player's stats are null

        //input player's stats are then applied
        switch (playerClass) {
            case 1:
                return new Warrior(level, force, intelligence, agility, name);
            case 2:
                return new Prowler(level, force, intelligence, agility, name);
            case 3:
                return new Mage(level, force, intelligence, agility, name);
            default:
                System.out.println("Mauvais choix, veuillez réessayer");
                return null;
        }

    }




    /**
     * Ask the player's name for creation
     * @param numPlayer - player 1 or 2
     * @return name entered
     */
    String askName(String numPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Création du player du " + numPlayer +
                "\nQuel est votre nom ?");
        return scanner.nextLine();
    }
}