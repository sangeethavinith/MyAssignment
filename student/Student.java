package Org.student;

import Org.college.College;

public class Student extends College {
		public void studentName() {
			System.out.println("Rohan");

		}
		public void studentDept() {
			System.out.println("IT");

		}
		public void studentId() {
		System.out.println("12dfg67");

		}
		 public static void main(String[] args) {
		 Student obj = new Student();
		 System.out.println("====  Details from College Class  ===");
	     obj.collegeName();
		 obj.collegeCode();
	     obj.collegeRank();
		 System.out.println("===  Details from Department class  ===");
	      // obj.departmentName();
		 System.out.println("===  Details from Student class  ===");
		 obj.studentName();
		 obj.studentDept();
		 obj.studentId();
		 }

	}

