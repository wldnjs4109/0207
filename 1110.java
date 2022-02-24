import java.util.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,C,L=0;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		C=N;
		do {	
			C=((C%10)*10)+(((C/10)+(C%10))%10);
			L++; 
		} while(C!=N); 
		System.out.println(L);	
	}
}
