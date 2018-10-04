import java.util.Scanner;

public class SnakeZoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Snake[] snakes = new Snake[3];
        System.out.println("Witaj w Zoo z unikalnymi wężami, co masz dla nas?");


        for (int i = 0; i < snakes.length; i++) {
            System.out.println("Wąż numer " + (i + 1));
            snakes[i] = SnakeCreator.addSnek();
            if (i != 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (snakes[i].equals(snakes[j])) {
                        System.out.println("Mamy takiego węża, przynieś oryginalnego");
                        System.out.println("Wąż numer " + (i + 1));
                        snakes[i] = SnakeCreator.addSnek();
                    }

                }
            }
        }
            System.out.println("Nasze węże");
            for (Snake snake : snakes) {
                System.out.println(snake);

            }
        sc.close();

        }
    }

