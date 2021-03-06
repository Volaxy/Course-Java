package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você precisa falar " + "\nas palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}

}
