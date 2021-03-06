package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };

		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}

		System.out.println();

		for (double nota : notas) {
			System.out.print(nota + " ");
		}
	}

}
