package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		d1.ano = 2021;

		var d2 = new Data(31, 12, 2020);

		String dataFormatada1 = d1.obterDataFormatada();

		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());

		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}

}
