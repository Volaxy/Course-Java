package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recupera��o.";
		System.out.println("O aluno est� " + resultadoFinal);

		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";

		System.out.printf("Tem desconto? %s", resultado);
	}

}
