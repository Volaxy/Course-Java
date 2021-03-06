package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = a;
		int c = a + b;

		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;

		System.out.println(c);

		c %= 2; // c = c % 2; 0 ou 1
		System.out.println(c);
	}

}
