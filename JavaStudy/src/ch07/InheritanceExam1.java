package ch07;

public class InheritanceExam1 {
	static void move(Car c) {
		
	}
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		Bus bs = new Bus();
		move(bs);
		
		Car[] cars = {sc, bs};
		
		for(int i = 0; i < cars.length; i++) {
			Car c = cars[i];
			c.move();
		}
		
		
		//		Car c = (Car) sc;
//		c.move();
//		( (SportsCar)c ).openSunloof();
//		
//		SportsCar cc = (SportsCar)c;
//		cc.openSunloof();
	}
}