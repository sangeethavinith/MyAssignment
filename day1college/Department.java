package week3.day1college;
public class Department extends College{

		   public void id() {
			   super.id();
				System.out.println("Department id is 10");
			}

			public void name(String name) {
				System.out.println(name);
			}


			public static void main(String[] args) {

				Department overriding=new Department();

				overriding.id();
				overriding.name("Information Technology");
		}

	}
	 

