package week3.day1polymorphism;

public class LearnComplieTime {
public void employee(int id) {
	System.out.println("EmpID:"+id);
}
public void employee(String empName,String companyName) {
	System.out.println("empName:"+empName+"companyName:"+companyName);
}
public void employee(float salary) {
	System.out.println("Empsalary:"+salary);
}
public void employee(String allowance) {
	System.out.println("Type of Allowance:"+allowance);
}
public static void main(String[] args) {
	LearnComplieTime overload=new LearnComplieTime();
	overload.employee(121);
	overload.employee(121.34f);
	overload.employee("Food allowance");
	overload.employee("siva", "TL");
	
}
}
