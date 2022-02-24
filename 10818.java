import java.util.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,MIN,MAX;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		int[] A=new int[N];
		
		for(int i=0;i<N;i++) {
			A[i]=s.nextInt();
		}
		MIN=MAX=A[0];
		for(int j=1;j<N;j++) {
			if(MIN>A[j]) {
				MIN=A[j];
			}
			if(MAX<A[j]) {
				MAX=A[j];
			}
		}
		System.out.println(MIN);
		System.out.println(MAX);
	}
}
