import java.util.Scanner;

public class Hitesh {

	public static void main(String[]args) {
		
		System.out.println("Enter the String");
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine().trim();
		
		while (str.length() > 0) {
			
			
			Scanner s1 = new Scanner(str);
			String str2 = str.trim().toLowerCase();
			
			System.out.println("Uper case is converted into lowercas");
			System.out.print(str2);
			
			
			str = s.nextLine().trim();
			s1.close();
		
		}
		System.out.print("If there is any empaty line then the program stops");
		s.close();
		

	       
		}
		
		
		public static void reverse(String Str2, String str1) {
			
			
	        String reverse = "";
	        
	        
	        for(int i = Str2.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + Str2.charAt(i);
	        }
	        
	        System.out.println("The input line, trimmed, upper case converted to lower case, non-alpha removed, and reversed.");
	        System.out.println(reverse);
	        
	        if (reverse.equals(str1)) {
	        	
	        	System.out.println("This is a Palindrome!");
	        }
	        
	        else {
	        	System.out.println("This is not a plaindrome!");
	        }
	        
		}
	

			
	}
	

