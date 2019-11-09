package ch18;

import java.util.HashSet;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		HashSet<Integer> lotto =
				new HashSet<Integer>();
		while(true) {
			Random ran = new Random();
			int num = ran.nextInt(45); // 0 ~ 44
			num = num + 1; // 1 ~ 45
			lotto.add(num);
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
	}
}






