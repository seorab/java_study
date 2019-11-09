package ch18;

import java.util.HashSet;

public class HashSetExam {
	public static void main(String[] args) {
		HashSet<Integer> set = 
			new HashSet<Integer>();
		for(int i = 1; i <= 10; i++) {
			set.add(i);
		}
		System.out.println(set);
	}
}







