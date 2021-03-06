package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}

}
