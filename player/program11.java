import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String a="sunday";
		String b="saturday";
		String n=sc.nextLine();
		if(n.equals(a)||n.equals(b))
		{
			System.out.print("yes");
			
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
