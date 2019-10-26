package string;

public class Exam12_1 {
	public static void main(String[] args) {
		//                01234567
		String nowDate = "20150926";
		
		String y = nowDate.substring(0, 4);
		String m = nowDate.substring(4, 6);
		String d = nowDate.substring(6, 8);
		nowDate = y + "-" + m + "-" + d;
		System.out.println(nowDate); // => [출력결과] 2015-09-26
		
		//                  0123456789
		String inputDate = "2015-09-26";
		
		y = inputDate.substring(0, 4);
		m = inputDate.substring(5, 7);
		d = inputDate.substring(8);
		inputDate = y + "년 " + m + "월 " + d + "일";
		
		System.out.println(inputDate); // => [출력결과] 2015년 09월 26일
	}
}







