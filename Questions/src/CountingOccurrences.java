import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter the number which you want to know the occurrence: ");
        int occ = in.nextInt();

        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == occ) {
                count++;
            }
            n = n / 10;
        }
        System.out.printf("This is the count of %d in the number: %d", occ, count);
        in.close();
    }
}
