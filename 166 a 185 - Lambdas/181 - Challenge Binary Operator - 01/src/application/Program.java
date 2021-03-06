	package application;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product("iPad", 10000.0, 0.2);
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto municipal: p >= 2500 (8.5%) / p < 2500 (Isento)
		 * 3. Frete: p >= 3000 (100) / p < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56
		 */
		
		// 1
		Function<Product, Double> op1 = p -> p.getPrice() * (1 - p.getDiscount());
		Double finalPrice1 = op1.apply(product1);
		System.out.println(finalPrice1);
		
		// 2
		UnaryOperator<Double> op2 = value -> value >= 2500 ? value * 1.085 : value;
		finalPrice1 = op2.apply(finalPrice1);
		System.out.println(finalPrice1);
		
		// 3
		UnaryOperator<Double> op3 = value -> value >= 3000 ? value + 100 : value + 50;
		finalPrice1 = op3.apply(finalPrice1);
		System.out.println(finalPrice1);
		
		// 4..5
		Consumer<Double> op4 = value -> System.out.printf("R$ %.2f\n\n".replace(".", ","), value);
		op4.accept(finalPrice1);
		
		Product product2 = new Product("iPad", 10000.0, 0.2);
		
		op4.accept(op1.andThen(op2).andThen(op3).apply(product2));
	}

}
