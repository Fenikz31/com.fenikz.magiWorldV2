import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int mcontinue = 1;

        // goes on until the player decide to leave
        while(mcontinue == 1) {
            new Game();

            mcontinue = -1;
            Scanner scanner = new Scanner(System.in);
            while(mcontinue < 0 || mcontinue > 1) {
                System.out.println("Voulez vous continuer ? \n 1 = Oui, 0 = Non \n");
                mcontinue =  scanner.nextInt();
            }
        }

    }
}
