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

        int T = scanner.nextInt();  // Number of test cases

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();  // Number of weeks
            int Y = scanner.nextInt();  // Cost per week

            int totalCost = X * Y;  // Calculate total cost
            System.out.println(totalCost);  // Print total cost
        }

        scanner.close();
	}
}
