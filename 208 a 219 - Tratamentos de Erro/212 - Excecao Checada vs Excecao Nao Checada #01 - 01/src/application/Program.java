package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			geraErro1();
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}

	//N�o checada ou n�o verificada - SEM OBRIGATORIEDADE DE TRATAR
	static void geraErro1() {
		// TODO Auto-generated method stub
		throw new RuntimeException("#01");
	}
	
	//Exce��o checada ou verificada - OBRIGATORIO TRATAR OU LAN�AR
	static void geraErro2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("#02");
	}

}
