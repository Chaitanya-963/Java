import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Take input from user till user does not press X or x for exit
        int ans = 0;
        while (true) {
            System.out.print("Enter operator (+,-,*,/,%) or x to exit: ");
            char op = in.next().trim().charAt(0);
            //take the operator as input


            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two number
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') ans = num1 + num2;
                if (op == '-') ans = num1 - num2;
                if (op == '*') ans = num1 * num2;
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue; // Skip printing the answer and restart loop
                    }
                }
                if (op == '%') ans = num1 % num2;

                System.out.printf("The answer for the %c of %d and %d is %d\n\n", op, num1, num2, ans);
            } else if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator...");
                break; // This exits the while loop
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        }
        in.close();
    }
}
