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
		 int[] matches = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		for(int i=0;i<t;i++)
		{
		    int total =0;
		    int a=scanner.nextInt();
		    int b=scanner.nextInt();
		    int sum=a+b;
		    //System.out.print("the sum is "+sum);
		    while(sum>0)
		    {
		        int d=sum%10;
		        total+=matches[d];
		        sum=sum/10;
		    }
		    System.out.println(" "+total);
		}
	}
}
