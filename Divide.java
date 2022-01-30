/*Given an integer N and M check if N candies can be divided in M people such that each person get equal number of candies.
Input
Input contains two integers N and M.

Constraints:
1 <= N <= 10^18
1 <= M <= 10^18
Output
Print "Yes" if it is possible otherwise "No". */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Divide {
	public static void main (String[] args) {
                      // Your code here
                      Scanner s = new Scanner(System.in);
                      long n = s.nextLong();
                       long m = s.nextLong();
                       if(n%m ==0)
                                                  System.out.println("Yes");
else
                                System.out.println("No");

                       
	}
}