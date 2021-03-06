package application;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados1 = new TreeSet<>();
		listaAprovados1.add("Ana");
		listaAprovados1.add("Carlos");
		listaAprovados1.add("Luca");
		listaAprovados1.add("Pedro");

		for (String candidato : listaAprovados1) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		// nums.get(1); Não é possível acessar pelo índice

		for (int n : nums) {
			System.out.println(n);
		}
	}

}
