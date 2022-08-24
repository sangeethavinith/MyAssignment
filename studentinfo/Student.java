package studentinfo;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id);
		System.out.println(name);

	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);

	}

	public static void main(String[] args) {
	Student  obj =new Student();
	obj.getStudentInfo(11);
	obj.getStudentInfo(11, "Rohan");
	obj.getStudentInfo("imrohan2509@gmail.com", 1234567890);

	}

}

