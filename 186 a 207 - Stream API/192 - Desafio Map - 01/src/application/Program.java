package application;

import java.util.Arrays;
import java.util.List;

import util.utils;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6 ,7, 8, 9);
		
		/*
		 * 1. N?mero para String bin?ria... 6 -> "110"
		 * 2. Reverter a string... "110" -> "011"
		 * 3. Converter de volta para inteiro -> "011" -> 3
		 */
		
		nums.stream().map(utils.toBinary).map(utils.revertString).map(utils.toInteger).forEach(System.out::println);
	}

}
