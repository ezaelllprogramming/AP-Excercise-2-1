import java.util.Scanner;

public class AreaToRadius
{
	public static void AreaToRadius(String[] args) {
	Scanner sc= new Scanner(System.in);
	double r = 0;
        double area = 0;
        System.out.print("Enter the circle's area: ");
        area = sc.nextDouble();
        r = Math.sqrt (area / Math.PI);
        System.out.println("The circle with area " + area + " units^2 has an radius of " + r + " units.");
	}
}
