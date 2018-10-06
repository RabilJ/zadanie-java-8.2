package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskMethod {
    private static Scanner sc = new Scanner(System.in);
    public static int checkForError(int number){
        while(true) {
            try {
                number = sc.nextInt();
                System.out.println("Podałeś poprawną wartość");
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Podałeś niepoprawną wartość, podaj liczbę");
                sc.next();
                continue;
            }
        }
        return number;
    }
}
