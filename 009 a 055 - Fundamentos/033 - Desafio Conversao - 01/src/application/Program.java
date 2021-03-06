package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your String: ");
		String s1 = sc.nextLine().replace(",", ".");
		double v1 = Double.parseDouble(s1);
		System.out.print("Enter your String: ");
		String s2 = sc.nextLine().replace(",", ".");
		double v2 = Double.parseDouble(s2);
		System.out.print("Enter your String: ");
		String s3 = sc.nextLine().replace(",", ".");
		double v3 = Double.parseDouble(s3);
		
		double sum = v1 + v2 + v3;
		
		System.out.println("Average: " + sum / 3);
		
		sc.close();
	}

}
