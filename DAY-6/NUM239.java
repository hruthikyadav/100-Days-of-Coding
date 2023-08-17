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
            int l = scanner.nextInt(); // Left range
            int r = scanner.nextInt(); // Right range
            int count = 0; // To count pretty numbers
            
            // Loop through the numbers from l to r (both inclusive)
            for (int num = l; num <= r; num++) {
                int lastDigit = num % 10; // Get the last digit
                
                if (lastDigit == 2 || lastDigit == 3 || lastDigit == 9) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
	}
}
