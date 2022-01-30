/*Tono has two integer intervals [A, B] and [C, D] (the intervals are inclusive of both numbers). She wonders if Solo will be able to solve the following simple problem:
Choose an integer X from first interval and an integer Y from second interval. Now for all combinations of X and Y, what is the maximum value of X*Y.

As Solo is small, please help her solve the problem.
Input
The first and the only line of input contains 4 integers A, B, C, and D.

Constraints
-109 <= A <= B <= 109
-109 <= C <= D <= 109
Output
Output a single integer, the maximum value of the product.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Weird {
	public static void main (String[] args) {
                      // Your code here
					  Scanner s = new Scanner(System.in);
					  long A = s.nextLong();
					  long B = s.nextLong();
					  long C = s.nextLong();
					  long D = s.nextLong();
					  long w = A*C;
					  if((A*D)>w){
						  w = A*D;
					  }
					  else if((B*C)>w){
						  w=B*C;
					  }
					  else if((B*D)>w){
						  w= B*D;
					  }
					  System.out.println(w);

	}
}