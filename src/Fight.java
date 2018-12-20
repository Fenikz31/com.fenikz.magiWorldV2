import playerClass.Player;

import java.util.Scanner;

class Fight {

    /**
     * Run the attacking process each turn
     *
     * @param attackingPlayer self explanatory
     * @param attackedPlayer self explanatory
     */
    void fight(Player attackingPlayer, Player attackedPlayer){

        // Ask what kind of attack
        Scanner scanner = new Scanner(System.in);
        System.out.println(attackingPlayer.getName() + " (" + attackingPlayer.getVitality()+ " vitalité) veuillez choisir votre action ( 1: Attaque Basique" + " 2: Attaque Speciale");

        int attack = scanner.nextInt();

        switch (attack) {
            case 1:
                attackingPlayer.basicAttack(attackedPlayer);
                break;
            case 2:
                attackingPlayer.specialAttack(attackedPlayer);
                break;
            default:
        }

    }
}
