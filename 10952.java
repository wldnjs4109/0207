import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int A,B;
		Scanner s = new Scanner(System.in);
 
		do {
			A = s.nextInt();
			B = s.nextInt();
			if(A+B!=0) {
			System.out.println(A+B);
			}
		} while (A!=0&&B!=0);
 
	}
}
