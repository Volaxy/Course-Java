package util;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class utils {
	public static final Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);
	public static final UnaryOperator<String> revertString = s -> new StringBuilder(s).reverse().toString();
	public static final Function<String, Integer> toInteger = s -> Integer.parseInt(s, 2);
}
