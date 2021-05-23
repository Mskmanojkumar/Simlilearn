

public class Exp {
public static void main(String arg []) { 
	int a = 27;
	int b=10;
	try {
		
		int c=a/b;
	   System.out.println("non veg"+ c);
	  int [] marks = {44,33,22,566,68};
	  System.out.println("non veg"+ marks[8]);
	
	}
	catch(ArithmeticException |ArrayIndexOutOfBoundsException   e)
	{	//System.out.println("non veg");
	e.printStackTrace();
	}
	catch(Exception e)
	{	System.out.println("non veg");
	e.printStackTrace();
	}
	finally {
		System.out.println(" veg");
	}
}
}
