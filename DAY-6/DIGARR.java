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
		 s.nextLine();
		for(int i=0;i<t;i++)
		{
		    int d=s.nextInt();
		    String n=s.next();
		    boolean find=false;
		     for(int j=0;j<d;j++)
		     {
		         if(n.charAt(j)=='5' || n.charAt(j)=='0')
		         {
		             System.out.println("Yes");
		             find=true;
		             break;
		         }
		         
		     }
		     if(!find)
		     {
		         System.out.println("No");
		     }
		}
	}
}
