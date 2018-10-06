package wyjatki;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Task{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[]numbers = new int[3];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę");
            int number = 0;
            number = TaskMethod.checkForError(number);
            numbers[i] = number;
            sum+=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);


    }
}