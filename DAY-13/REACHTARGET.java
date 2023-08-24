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

        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); // Target score for Team B
            int Y = scanner.nextInt(); // Current score of Team B

            int runsNeeded = X - Y; // Calculate runs needed

            System.out.println(runsNeeded); // Output runs needed
        }

        scanner.close();
	}
}
