package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (°F − 32) × 5/9 = °C
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "˚C.");

		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "˚C.");
	}

}
