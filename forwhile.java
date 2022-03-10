package loops;

public class forwhile {

	public static void main(String[] args) {
		int a = 12;
		int b = 23;
		
		if (a>b) {
			System.out.println("a is greater than b");
		}else
		{
			System.out.println("a is less than b");
		}
		
        for(int i=1;i<=10;i++) {
        	System.out.println(i);
	    }
        
        for (int i=0;i<=3;i++)
        {
        	for(int j=0;j<=3;j++)

        {for(int k=0;k<=3;k++) {
       
        	System.out.println(i+" "+j+" "+k);
        	
        }
        }
        }
        }

}
