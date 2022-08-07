package week1.day1;

public class Bike {
	String applyBreak;
	String soundHorn;

   
	public static void main(String[] args) {
		Car1 aa=new Car1();
		aa.applyBreak();
		aa.soundHorn();
		Bike bb=new Bike();
		bb.applyBreak();
		bb.soundHorn();

	}
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void soundHorn() {
		System.out.println("sound horn");
	}

}
