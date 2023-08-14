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
            int X = scanner.nextInt(); // Chef's roll
            int Y = scanner.nextInt(); // Chefina's roll
            
            if (X + Y > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
	}
}
