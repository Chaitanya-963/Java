import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int number;
        do {
            System.out.print("Enter the number: ");
            number = scanner.nextInt();
        } while (number == 10);

        if (number == 10) {
            System.out.println("You guess the correct number");
        }
    }
}
