package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		String lastLang = (String) Lists.getLast1(langs);
		System.out.println(lastLang);
		
		Integer lastNum = (Integer) Lists.getLast1(nums);
		System.out.println(lastNum);
		
		
		
		String lastLang2 = Lists.getLast2(langs);
		System.out.println(lastLang2);
		
		Integer lastNum2 = Lists.<Integer>getLast2(nums);
		System.out.println(lastNum2);
	}

}
