/*You went to shopping. You bought an item worth N rupees. What is the minimum change that you can get from the shopkeeper if you possess only 200 and 500 rupees notes.

Eg: If N = 678, the minimum change you can receive is 22, if you pay the shopkeeper a 500 and a 200 rupee note. You can show that no other combination can lead to a change lesser than this like (200, 200, 200, 200) or (500, 500).

Note: You have infinite number of 200 and 500 rupees notes. Enjoy, XD.
Input
The first and the only line of input contains an integer N.

Constraints
1 <= N <= 1000000000
Output
Output a single integer, the minimum amount of change that you will receive.
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Shopping {
	public static void main (String[] args) {
                      // Your code here
					  Scanner s = new Scanner(System.in);
					  long amt = s.nextLong();
					  if(amt<=200){
						  System.out.println(200-amt);
					  }
					  else if(amt<=400){
						  System.out.println(400-amt);
					  }
					else{
						amt = (100-(amt%100))%100;
					System.out.println(amt);
					}
				  

	}
}