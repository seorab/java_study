package ch18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WordCount {
	public static void main(String[] args) {
		StringBuffer text = new StringBuffer();
		text.append("�������� ����Ĩ ���� ��� �������� ����Ĩ�� ");
		text.append("������ ����Ĩ ������ ������ ����Ĩ�� ���� ");
		text.append("������ ����Ĩ�� �ǰ� �; ������ ����Ĩ ���� ���µ� ");
		text.append("������ ����Ĩ ������ ������ ����Ĩ �����Ⱑ ");
		text.append("�� ������ ����Ĩ�� �ƴϰ� �������� ����Ĩ�̴ϱ� ");
		text.append("�������� ����Ĩ���󿡼� ��� ����ؼ� ");
		text.append("�������� ����Ĩ�� ������ ����Ĩ�� �Ǵ� ���� �����ϰ� ");
		text.append("�������� ����Ĩ ����� ���ư���. ");
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