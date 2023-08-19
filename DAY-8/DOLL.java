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
		int t=scanner.nextInt();
		for(int i=0;i<t;i++)
		{
		    int count=0;
		    int n=scanner.nextInt();
		    int k=scanner.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=scanner.nextInt();
		    }
		    for(int l=0;l<n;l++)
		    {
		        if(a[l]>k)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
