package ch18;
import java.util.Arrays;

public class 제외수 {
	int totalCount = 0;
	
	public static void main(String[] ar) {
		제외수 ex = new 제외수();
		int[] input = { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 15, 16, 23, 25, 26, 28, 31, 32, 34, 35, 36, 37, 39, 41, 42,
				44, 45 };
		Arrays.sort(input);
		int count = 45 - input.length;

		int idx = 0;
		int[] arr = new int[count];

		int num = 1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != num) {
				System.out.printf("i%d num%d input[i]%d idx%d \n", i, num, input[i], idx);
				arr[idx] = num;
				idx++;
				i--;
			}

			num++;
		}

		System.out.println(Arrays.toString(arr));

		int n = arr.length;
		int r = 6;
		int[] combArr = new int[n];

		ex.doCombination(combArr, n, r, 0, 0, arr);
		
		System.out.println("珥? 媛쒖닔 : " + ex.totalCount);
	}

	public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr) {
		if (r == 0) {
			for (int i = 0; i < index; i++) {
				System.out.print(arr[combArr[i]] + " ");
			}
			System.out.println((++totalCount));
		} else if (target == n) {
			return;
		} else {
			combArr[index] = target;
			doCombination(combArr, n, r - 1, index + 1, target + 1, arr); // (i)
			doCombination(combArr, n, r, index, target + 1, arr); // (ii)
		}
	}
}