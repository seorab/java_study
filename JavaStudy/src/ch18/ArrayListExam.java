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
		
		
		
		
		
		// arrayList 이름을 가진 ArrayList 생성
		List<String> arrayList = new ArrayList<String>();
		// ArrayList 에 element 추가
		arrayList.add("1번");
		arrayList.add("2번");
		arrayList.add("3번");
		// ArrayList 에 element 추가
		arrayList.add("=> 4번");
		arrayList.add("=> 5번");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
		//ArrayList의 4번째와 5번째 element를 삭제
		arrayList.remove(4);
		arrayList.remove(3);
		//ArrayList 에 index를 부여한 element 추가
		arrayList.add(0, "=> 4번");
		arrayList.add(1, "=> 5번");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}
	}
}