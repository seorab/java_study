package ch18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WordCount {
	public static void main(String[] args) {
		StringBuffer text = new StringBuffer();
		text.append("안촉촉한 초코칩 나라에 살던 안촉촉한 초코칩이 ");
		text.append("촉촉한 초코칩 나라의 촉촉한 초코칩을 보고 ");
		text.append("촉촉한 초코칩이 되고 싶어서 촉촉한 초코칩 나라에 갔는데 ");
		text.append("촉촉한 초코칩 나라의 촉촉한 초코칩 문지기가 ");
		text.append("넌 촉촉한 초코칩이 아니고 안촉촉한 초코칩이니까 ");
		text.append("안촉촉한 초코칩나라에서 살아 라고해서 ");
		text.append("안촉촉한 초코칩은 촉촉한 초코칩이 되는 것을 포기하고 ");
		text.append("안촉촉한 초코칩 나라로 돌아갔다. ");
		String[] words = text.toString().split(" ");
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		for (String word : words) {
			boolean isContain = wordMap.containsKey(word);
			int count = 1;
			if (isContain) {
				count = wordMap.get(word);
				count++;
			}
			wordMap.put(word, count);
		}
		System.out.println(wordMap);
		Set<String> keys = wordMap.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			int value = wordMap.get(key);
			System.out.println(key + " - " + value);
		}
	}
}