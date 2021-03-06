package application;

import java.util.List;

public class Lists {
	
	public static Object getLast1(List<?> list) {
		return list.get(list.size() - 1);
	}
	
	public static <T> T getLast2(List<T> list) {
		return list.get(list.size() - 1);
	}
	
	public static <A, B, C> C getPar(A par1, B par2) {
		C test = null;
		return test;
	}

}
