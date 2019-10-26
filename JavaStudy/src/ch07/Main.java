package ch07;

public class Main {
	public static void main(String[] args) {
		/* 헌혈자 정보 */
		Human human = new Human();
		human.setName("김");
		human.setType('O');
		human.setAge(70);

		/* BloodHouse 객체 생성 */
		String result = ""; // action() 메소드 호출 결과 저장
		BloodHouse bh = new BloodHouse();
		result = bh.action(human);
		
		/* action() 메소드를 호출하면서 매개변수로 헌혈자 정보 넘겨줌 */
		/* action() 메소드 호출 결과 출력 */
		System.out.println(result);
	}
}







