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
		        int countstart=0;
		        int countlinme=0;
		        int n=s.nextInt();
		        s.nextLine();
		        String sc=s.nextLine();
		        for(int j=0;j<sc.length();j++)
		        {
		            if(sc.charAt(j)=='S')
		            {
		                countstart++;
		            }
		            else if(sc.charAt(j)=='L')
		            {
		                countlinme++;
		            }
		            
		        }
		        System.out.println(countstart+" "+countlinme);
		}
		   
	}
		
}

