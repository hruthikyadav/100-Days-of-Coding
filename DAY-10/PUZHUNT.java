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
        
        int N = scanner.nextInt(); // Number of people in Chef's team
        
        if (N >= 6 && N <= 8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
	}
}
