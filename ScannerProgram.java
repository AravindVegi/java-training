package math;
import java.util.Scanner;
public class ScannerProgram {
public static void main(String[] args) {
		        
		        Scanner s = new Scanner(System.in);//bcoz input for system
		        System.out.println("Entered number is :" );
//		        number = s.nextInt();//bcoz input is int
		        String name = s.next();
		        System.out.println("received string is " + name.length());
//		        System.out.println("received number is:"+ number);    
		        System.out.println("received string is:" +name.toUpperCase());
		        System.out.println("received string is:" +name.toLowerCase());
		        s.close();
		    }

}
