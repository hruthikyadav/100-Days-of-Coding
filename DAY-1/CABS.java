/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x,y;
		for(int i=0;i<t;i++)
		{
		    x=sc.nextInt();
		    y=sc.nextInt();
		    if(x<y){
		        System.out.println("FIRST");
		    }
		    else if(x>y){
		        System.out.println("SECOND");
		    }
		    else{
		       System.out.println("ANY");
		    }
		}
	}
}
