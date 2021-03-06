package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}

		// Versão do desafio
		// Não pode usar valor numérico pra controlar o laço!

		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
