package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}

		// Vers�o do desafio
		// N�o pode usar valor num�rico pra controlar o la�o!

		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
