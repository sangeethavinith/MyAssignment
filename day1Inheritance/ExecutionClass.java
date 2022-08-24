package week3.day1Inheritance;


	public class ExecutionClass extends Pet{
		public void learningInherritance() {
			System.out.println("Type of Inheritance");
		}
		public static void main(String[] args) {
			ExecutionClass call=new ExecutionClass();
			call.barking();
			call.chasing();
			call.eating();
			call.lovableFeature();
			call.providesSecurity();
			String colour2=call.colour;
			System.out.println(colour2);
		}
	}
	

