import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {

        System.out.println("First Degree Equation Computer");
        System.out.println("Given a equation as 'a*x + b = c', please enter arguments:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\ta: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.print("With a = 0, equation pass with any 'x'");
        } else {

            System.out.print("\tb: ");
            double b = scanner.nextDouble();

            System.out.print("\tc: ");
            double c = scanner.nextDouble();

            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f\n", answer);
        }

        System.out.println("Thanks you! Goodbye!");

    }
}
