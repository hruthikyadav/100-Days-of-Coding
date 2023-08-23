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
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Required donations
            int x = scanner.nextInt(); // Collected donations
            int remainingDonations = n - x; // Calculate remaining donations
            System.out.println(remainingDonations); // Output remaining donations
        }
	}
}
