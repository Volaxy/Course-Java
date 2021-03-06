package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declara uma fun??o consumer que recebe um Produto e execulta uma a??o
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		
		//Metodo para execultar o Consumer
		imprimir.accept(p1);
		
		Produto p2 = new Produto("PC", 1002.34, 0.1);
		
		List<Produto> produtos = Arrays.asList(p1, p2);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
