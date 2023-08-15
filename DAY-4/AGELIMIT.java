/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int a,b,c;
		for(int i=0;i<t;i++)
		{
		    a=s.nextInt();
		    b=s.nextInt();
		    c=s.nextInt();
		    
		     if (c>=a && c<b)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
