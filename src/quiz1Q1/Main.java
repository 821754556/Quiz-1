package quiz1Q1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of passing attempts: ");
		double ATT = input.nextDouble();
		System.out.print("Number of completions: ");
		double COMP = input.nextDouble();
		System.out.print("Passing yards: ");
		double YDS = input.nextDouble();
		System.out.print("Touchdown passes: ");
		double TD = input.nextDouble();
		System.out.print("Interceptions: ");
		double INT = input.nextDouble();
		
		double a = (COMP / ATT - 0.3) * 5;
		double b = (YDS / ATT - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - (INT / ATT * 25);
		
		double QBrating = (a + b + c + d) / 6 * 100;
		
		System.out.print("The QB rating for the 5 data you enter is: " + QBrating);
	}

}