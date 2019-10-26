package ch06;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		//1 4 10 14 15 35
		set.add("1");
		set.add("4");
		set.add("10");
		set.add("14");
		set.add("15");
		set.add("35");

		Set<String> myNumber = new TreeSet<String>();
		int count = 0;
		boolean isMatch = false;
		while (!isMatch) {
			myNumber.clear();
			while (myNumber.size() < 6) {
				int num = (int) (Math.random() * 45) + 1;
				myNumber.add(num + "");
			}
			isMatch = set.containsAll(myNumber);
			System.out.println(set);
			System.out.println(myNumber);
			count++;
			System.out.println(count);
		}
		System.out.println("½ÃµµÈ½¼ö : " + count);
	}

}