import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		StringBuffer sb= new StringBuffer();
		sb.append(n);
		sb=sb.reverse();
		System.out.print(sb);
	}
}
