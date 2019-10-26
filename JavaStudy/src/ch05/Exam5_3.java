package ch05;

import java.util.Random;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < 1000; i++) {
			Random r = new Random();
			int num = r.nextInt(nums.length);
			char temp = ' ';
			temp = nums[0];
			nums[0] = nums[num];
			nums[num] = temp;
		}

		System.out.println(nums);
	}
}