import playerClass.Player;

public class Game {

    // run the process for each intance
    Game() {
        System.out.println("Bienvenue à MagiWorld ! Un monde sanginaire où guerrier, rôdeur et magicien" +
                "s'affronte pour dominer le monde ! \n ");

        String namePlayer1 = "Joueur 1";
        String namePlayer2 = "Joueur 2";


        Player player1 = this.configure(namePlayer1);
        Player player2 = this.configure(namePlayer2);

        String winner = this.deathMatch(player1, player2);

        System.out.println("Et le gagnant est... " + winner +  " !!! \n ");

    }




    /**
     * Run the gameplay process configuration
     *
     * @param player
     * @return Player
     */
    private Player configure(String player){
        GamePlay gameplay = new GamePlay();
        player = gameplay.askName(player);
        gameplay.askPLayerStats();
        return gameplay.creation(player);
    }




    /**
     * Run a turned base death match between 2 players
     *
     * @param player1
     * @param player2
     * @return winner
     */
    private String deathMatch(Player player1, Player player2) {
        int endGame = 1;
        String winner = "";
        Fight attack = new Fight();

        while (endGame == 1) {

            if (player1.getVitality() < 1) {
                System.out.println(player1.getName() + " est mort \n");
                winner = player2.getName();
                endGame = 0;
            } else {
                attack.fight(player1, player2);
            }

            if (player2.getVitality() < 1) {
                System.out.println(player2.getName() + " est mort \n");
                winner = player1.getName();
                endGame = 0;
                System.out.println("Le combat est terminé\n");
            } else if (endGame == 0) {
                System.out.println("Le combat est terminé\n");
            } else {
                attack.fight(player2, player1);
            }

        }
        return winner;
    }
}
