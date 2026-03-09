import java.util.Scanner;

public class FibonacciNumberQue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the index number: ");
        int n = in.nextInt();

        int prev = 0;
        int curr = 1;

        if(n == 0){
            curr = n;
        }

        int count = 2;
        while (count <= n) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
            count++;
        }

        System.out.printf("%d value is the of %d index in the fibonacci series", curr, n);
    }
}
