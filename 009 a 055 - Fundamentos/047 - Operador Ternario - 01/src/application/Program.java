package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);

		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";

		System.out.printf("Tem desconto? %s", resultado);
	}

}
