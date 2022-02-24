import java.util.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int A,B;
		Scanner s = new Scanner(System.in);
 
		while(s.hasNextInt()) {
			A = s.nextInt();
			B = s.nextInt();
			
			System.out.println(A+B);
		}	
		
 
	}
}
