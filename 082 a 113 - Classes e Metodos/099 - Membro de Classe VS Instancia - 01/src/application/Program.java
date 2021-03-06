package application;

import entities.Circle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a1 = new Circle(10);
		a1.raio = 10;
		// a1.pi = 1000000;

		// AreaCirc.PI = 3.1415;

		System.out.println(a1.area());

		System.out.println(Circle.area(100));
		System.out.println(Circle.PI);
		System.out.println(Math.PI);
	}

}
