import java.util.Locale;
import java.util.Scanner;

public class SnakeCreator {

    public static Snake addSnek(){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Snake snake = new Snake(null,0.0);

        System.out.println("Podaj gatunek węża: ");
        snake.setSpecies(sc.nextLine());
        System.out.println("Podaj długość węża: ");
        snake.setLenght(sc.nextDouble());
        sc.nextLine();
        return snake;
    }
}
