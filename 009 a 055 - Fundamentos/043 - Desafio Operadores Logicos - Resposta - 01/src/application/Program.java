package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)

		boolean trabalho1 = false;
		boolean trabalho2 = false;

		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;

		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;

		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
	}

}
