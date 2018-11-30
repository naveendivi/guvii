import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int k=1,p=0;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int j=0;j<n;j++)
	{
		k=a[j]*a[j];
		p+=k;
	}
		
		System.out.println(p);
	}
}
