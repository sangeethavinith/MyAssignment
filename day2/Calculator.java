package week1.day2;

public class Calculator {
public void add(int num1,int num2) {
 System.out.println(num1+num2);
} 
public void sub(float num1,float num2) {
	 System.out.println(num1-num2);
	}
public void mul(int num1,float num2) {
	 System.out.println(num1*num2);
	}
public void div(int num1,int num2) {
	 System.out.println(num1/num2);
	} 


	public static void main(String[] args) {
	Calculator num=new Calculator();
	num.add(6,5);
	num.sub(2.9f,3.0f);
	num.mul(2,3.2f);
	num.div(6,3);


	}

}
