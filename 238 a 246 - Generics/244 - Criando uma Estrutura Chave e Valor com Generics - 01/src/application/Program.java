package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pares<Integer, String> resultadoConcurso = new Pares<Integer, String>();
		
		resultadoConcurso.add(1, "Maria");
		resultadoConcurso.add(2, "Ana");
		resultadoConcurso.add(3, "Junior");
		resultadoConcurso.add(4, "Jess");
		resultadoConcurso.add(2, "Pedro");
		
		System.out.println(resultadoConcurso.getValue(1));
		System.out.println(resultadoConcurso.getValue(2));
	}

}
