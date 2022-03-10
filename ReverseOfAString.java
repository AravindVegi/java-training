package reverseofastring;

public class ReverseOfAString {

	public static void main(String[] args) {
		
				 String string = "Aravind";    
			            
			        String reversedStr = "";    
			            
			      
			        for(int i = string.length()-1; i >= 0; i--)
			        {    
			            reversedStr = reversedStr + string.charAt(i);    
			        }    
			            
			        System.out.println("Actual string: " + string);    
			            
			        System.out.println(" after Reversing of given string: " + reversedStr);  
			}

	}


