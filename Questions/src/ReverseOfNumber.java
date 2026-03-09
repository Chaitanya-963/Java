import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n = n / 10;
        }
        System.out.printf("The reverse number is %d", reverse);
        in.close();
    }
}
