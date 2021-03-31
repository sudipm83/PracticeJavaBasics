package stringOperation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PracticeStringOperation {

	public static void main(String[] args) {
		System.out.println("Test");
		strPractice();
	}
	
public static void strPractice() {
		
		//1. Print only the values like Isaac, Newton, UK, ...etc
		HashMap<String, String> coll = new HashMap();
		
		String str = "FName=Isaac|LName=Newton|Address=UK|Age=10|School=Trinity|Invention=LawsOfMotion";
		String[] subsStr =  str.split("\\|");
		for(int i=0; i < subsStr.length; i++)
		{
			//System.out.println(subsStr[i]);
			String spittedVal = subsStr[i];
			String values =  spittedVal.substring(spittedVal.indexOf("=")+1,spittedVal.length());
			String valParam = spittedVal.substring(0,spittedVal.indexOf("=")+1);
			//System.out.println("final values are "+values);
			
			coll.put(valParam, values);
			System.out.println("Printing out final collection :" +coll.get(valParam));
						
		}
			System.out.println("*****************************************");
		
		//2. Print length of a string with out using String class length method.
		String str1 = "Print the length of a string without using length method.";
		char[] lengthOfString = str1.toCharArray();
		int count = 0;
		for(char eachchar : lengthOfString)
		{
			System.out.println(eachchar);
			count ++;
			
		}
		System.out.println("Length of the String is :"+count);	
		
		//3. How to reverse a string
		//Solution 1 - 
		String str2 = "Reverse";
		String reverse = "";
		for(int i = str2.length()-1; i>= 0; i--)
		{
			reverse = reverse + str2.charAt(i);
			
		}
		System.out.println("Reversed string is : "+reverse);
		
		//Solution 2 - using String buffer
		StringBuffer sb = new StringBuffer();
		sb.append(str2);
		System.out.println("Reversing the string using String Buffer : "+sb.reverse());
		
		//4. How to covert String to String Buffer and vice versa
		String str3 = "Selenium";
		StringBuffer sb1 = new StringBuffer();
		sb1.append(str3);
		System.out.println("Now our string is converted to string buffer : "+sb1);
		
		//converting back to string from string buffer
		String newstr3 = sb1.toString();
		System.out.println("Now our string buffer is coverted back to string again : "+newstr3);
		
		//5. Remove junk charecters from a string.
		String str4 = "@#$%!&*89())_S)458/$#u*&$|d()&i)(#@p_ (*&^|}{:;S?>e:)(*&l%$^&e)(<>:n$#%i/-u+m";
		str4 = 	str4.replaceAll("[^a-zA-Z]", "");
		System.out.println("After removing special char from string : "+str4);
				
		//6. Remove space from start, middle and end
		String str5 = "  Sudip Selenium  ";
		
		// use trim function to remove space from start and end, but it will not remove space from middle
		str5 = str5.trim();
		System.out.println("Space removed from start and end : -"+str5);
		str5 = str5.replace(" ", "");
		System.out.println("Removing space from middle :-"+str5);
		
		//7. How to find duplicate char in a string array[]
		
		//8. How to find a duplicate char from a string
		//Solution 1
		String str6 = "Textcx";
		char alphabet;
		char alphabet1;
		int count1 = 0;
		for(int i = 0; i <= str6.length()-1; i++)
		{
			alphabet = str6.charAt(i);
			for(int j = count1+1; j <= str6.length()-1; j++)
			{
				alphabet1 = str6.charAt(j);
			
			
				if(alphabet==alphabet1)
				{
					System.out.println("Duplicate char found inside the string :"+alphabet1);
						
					
				}
				
			}
			count1 ++;
		}
		
		//Solution 2 -
		
		String str7 = "Textcx";
		int count2 = 0;
		char[] str7array = str7.toCharArray();
		for(int i = 0 ; i <= str7array.length-1; i++)
		{
			for(int j = count2+1; j<=str7array.length-1; j++)
			{
			
				if(str7array[i]==str7array[j])
					{
						System.out.println("Duplicate char found inside the string :"+str7array[j]);
					}
			}
			count2 ++;
		}
		
		// For both the above solution time complexity is O(n)square
		
		// Solutions 3 -
		String str8 = "Textcxc";
		Set hs = new HashSet();
		char[] str8array = str8.toCharArray();
		for(int i = 0; i <= str8array.length-1; i++)
		{
			if(hs.add(str8array[i])==false)
			{
				
				System.out.println("This is a duplicate character :"+str8array[i]);
				
			}
		
		}
		
		//9. Delete a word from a sentence. Remove word 'dont' from the below sentnce
		String sentence = "I dont love working on java and selenium.";
		sentence = sentence.replace("dont ", "");
		System.out.println(sentence);
		
		//10. Count number of words in a string
		String sentence1 = "I love working on java and selenium.";
		int count3 = 0;
		for(int i = 0; i<=sentence1.length()-1; i++)
		{
			if(sentence1.charAt(i)==' ' && sentence1.charAt(i+1)!=' ')
			{
				count3++;
			}
			
		}
		System.out.println("Number of words in this sentence is "+ (count3+1));
		
		//11. Check if char is alphabet or not
		// Solution 1
		String str9 = "Sel&en^ium";
		for(int i=0; i<=str9.length()-1;i++)
		{
			if(!Character.isLetter(str9.charAt(i)))
			{
				System.out.println("Char at index "+i+" is not a alphabet :"+str9.charAt(i));
			}
			
		}
		
		//Solution 2
		for(char c : str9.toCharArray())
		{
			if(Character.isLetter(c))
			{
				System.out.println("Char is a alphabet "+c);
			}
			else
			{
				System.out.println("Char is not a alphabet "+c);
			}
			
		}
		
		//Solution 3
		String str10 = "Sel#en&ium";
			if(str9.matches("[A-Za-z]"))
			{
				System.out.println("String have alphabets");
			}
			else
			{
				System.out.println("String does not have alphabets");
			}
			
		//12. Remove vowels from a string
		String str11 = "I Love Selenium Verry Much.";
		str11 = str11.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String after removing all the vowels : "+ str11);
		
		//13. Compare two strings
		String str12 = "ABCD";
		String str13 = "ACD";
		System.out.println(str12.compareTo(str13));
		if(str12.compareTo(str13)==0)
		{
			System.out.println("Both the string are same.");
		}
		else 
		{
			System.out.println("Both the string are NOT same.");
		}
		
		//14. Print only the vowels from a string
		String str14 = "Selenium";
		str14 = str14.replaceAll("^[aeiouAEIOU]", "");
		System.out.println("Only vowels present in this string :"+str14);
		
		//15. Capitalize the first letter of the string
		
		//16. Capitalize the last letter of the string
		
		//17. Capitalize any given input indexed letter of a string
  }

}
