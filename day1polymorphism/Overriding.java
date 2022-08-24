package week3.day1polymorphism;


 public class Overriding extends Overridingparent{
	 public void MyHouse() 
	    {
	    	super.MyHouse();;
	System.out.println("ChildHouse");
	    } 
	    public void familyName(String name)
	    {
	    	System.out.println(name);
	    }
	    public static void main(String[] args) {
			Overriding learn=new Overriding();
			learn.familyName("Singh");
			learn.MyHouse();
		}
 }

