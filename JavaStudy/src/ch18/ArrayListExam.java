package ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		HashMap<String, Integer> map;
		ArrayList<HashMap<String, Integer>>  list2;
		
		String s = "hello";
		String s2 = new String("hello");
		
		Byte b = 1;
		byte b2 = 1;
		Byte b3 = new Byte("1");
		List<Byte> aaa = new ArrayList<Byte>();
		aaa.add(new Byte("1"));
		aaa.add(new Byte("2"));
		Byte bb = 3;
		aaa.add(bb);
		
		
		
		
		
		// arrayList �̸��� ���� ArrayList ����
		List<String> arrayList = new ArrayList<String>();
		// ArrayList �� element �߰�
		arrayList.add("1��");
		arrayList.add("2��");
		arrayList.add("3��");
		// ArrayList �� element �߰�
		arrayList.add("=> 4��");
		arrayList.add("=> 5��");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
		//ArrayList�� 4��°�� 5��° element�� ����
		arrayList.remove(4);
		arrayList.remove(3);
		//ArrayList �� index�� �ο��� element �߰�
		arrayList.add(0, "=> 4��");
		arrayList.add(1, "=> 5��");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
	}
}