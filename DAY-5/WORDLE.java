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
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		for(int i =0;i<n;i++)
		{
		    String s=scanner.nextLine();
		    String t=scanner.nextLine();
		    char[] sc=s.toCharArray();
		    char[] tc=t.toCharArray();
		    for(int j=0;j<5;j++)
		    {
		        if(sc[j]==tc[j])
		        {
		            System.out.print("G");
		        }
		        else
		        {
		            System.out.print("B");
		        }
		    }
		    System.out.println();
		}
	}
}
