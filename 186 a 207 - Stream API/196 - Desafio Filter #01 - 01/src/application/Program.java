package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto("Internet", "Computador", 1000.00);
		Produto p2 = new Produto("Cozinha", "mesa", 280.00);
		Produto p3 = new Produto("Carro", "Farol", 450.00);
		Produto p4 = new Produto("Cozinha", "Panela", 500.00);
		Produto p5 = new Produto("Jogos", "God Of War", 100.00);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> categoria = p -> p.categoria == "Cozinha";
		Predicate<Produto> preco = p -> p.preco >= 250;
		Function<Produto, String> produto = p -> "Produto achado!!! " + p.toString();
		
		produtos.stream().filter(categoria).filter(preco).map(produto).forEach(System.out::println);
	}

}
