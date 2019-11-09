package ch18;

import java.util.HashMap;

public class HashMapExam {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "4");
		System.out.println(map);
		map.put("A", "10");
		System.out.println(map);
	}
}