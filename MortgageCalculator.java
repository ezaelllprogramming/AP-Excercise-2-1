import java.util.Scanner;

class MortgageCalculator {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = 0;
        double r = 0;
        double n = 0;
        double i = 0;
        System.out.println("Investment Calculator");
        System.out.println("--------------------");
        System.out.println("");
        System.out.print("Enter the investment's principle amount in dollars: $");
        p = sc.nextDouble();
        System.out.print("Enter the investment's interest rate (between 0 and 1): ");
        r = sc.nextDouble();
        System.out.print("Enter the number of years the investment will accumulate wealth: ");
        n = sc.nextDouble();
        i = p * Math.pow(1+r,n);
        System.out.println("This investment will be worth $" + i + " after " + n + " years.");
    }
}