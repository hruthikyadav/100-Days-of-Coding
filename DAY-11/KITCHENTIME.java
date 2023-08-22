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
		 Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            // Read the starting and ending time
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Calculate the number of hours Chef works
            int hoursWorked = (Y - X + 12) % 12; // Taking care of 12-hour clock
            
            System.out.println(hoursWorked);
        }
        
        scanner.close();
	}
}
