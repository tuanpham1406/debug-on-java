import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("First Degree Equation Computer");
        System.out.println("Given a equation as 'a*x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\ta: ");
        double a = scanner.nextDouble();

        System.out.print("\tb: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double answer = -b / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("Equation pass with any 'x'!");
            } else {
                System.out.print("Equation has no root!");
            }
        }

        System.out.println("Thanks you! Goodbye!");

    }
}
