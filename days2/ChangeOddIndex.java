package week3.days2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changename";
	       char[] characters= test.toCharArray();
	       for(int i=0; i<characters.length; i++)
	       {

			char ch=characters[i];

			if(i%2==0)
	    	   {
	  ch=Character.toUpperCase(ch);
	    	   }
	 System.out.print(ch);

	       }

	}

}
