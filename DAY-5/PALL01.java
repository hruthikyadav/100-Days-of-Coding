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
		for(int i=0;i<t;i++)
		{
		    int n=s.nextInt();
		    if(isPalindrome(n))
		    {
		        System.out.println("wins");
		    }
		    else{
		        System.out.println("loses");
		    }
		}
		
	}
	public static boolean isPalindrome(int num)
		{
		    int original=num;
		    int reverse=0;
		    while(num>0)
		    {
		        int digit=num%10;
		        reverse=reverse*10+digit;
		        num=num/10;
		    }
		    return original==reverse;
		}
}
