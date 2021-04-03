package NumericOperations;

import java.util.stream.IntStream;

public class practiceNumericOperation {

	public static void main(String[] args) {
		
		//1. Print 1 to 100 without using any number
		// Solution 1
		int int1 = 'A'/'A';
		String hundred = "..........";
		
		for(int i = int1; i <= hundred.length()*hundred.length(); i++)
		{
			System.out.println("Printing without using number :"+i);
		}
		
		// Solution 2 asci value of a = 97 ...d = 100
		int a = 'd';
		for(int i = int1; i<=a; i++)
		{
			System.out.println("Printing without using number & using ASCI value:"+i);
		}
		
		// Solution 3 using ascii value and java streams with loop
		
		
		//range excludes the
			System.out.println("Method 1");
			IntStream.range(int1, a).forEach(
	                val -> System.out.println(val)
	        );
		    
		    System.out.println("Method 2");
		    //range excludes the 
		    IntStream.range(int1, a).forEach(System.out::println);
		    
		    	System.out.println("Using rangeClosed");
		    //rangeClosed includes the number
		    IntStream.rangeClosed(int1, a).forEach(System.out::println);
		    
		    

	}

}
