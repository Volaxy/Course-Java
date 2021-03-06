package entities;

public class Circle {
	public double raio;
	public final static double PI = 3.1415;

	public Circle(double raioInicial) {
		raio = raioInicial;
	}

	public double area() {
		return PI * Math.pow(raio, 2);
	}

	public static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
