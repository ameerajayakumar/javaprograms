/*A contest setter wants to determine the time limits for a given problem. There are n model solutions, and solution k takes tk milliseconds to run on the test data. The contest setter wants the time limit to be an integer number of seconds, and wants the time limit to be at least s times larger than the slowest model solution. Compute the minimum time limit the contest setter can set.
Input
The first line of input contains two space-separated integers n and s (1 ≤ n ≤ 100 and 1 ≤ s ≤ 20).
The second line of input contains n space-separated integers t1, . . . , tn (1 ≤ tk ≤ 2000 for all
k = 1, . . . , n).
Output
Print, on one line, the minimum time limit (in seconds) as a single integer. */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Time {
	public static void main (String[] args) {
                      // Your code here
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int k = s.nextInt();
			int arr[] = new int [n];
			int c=0;
			for(int i=0;i<n;i++){
				arr[i] = s.nextInt();
				if(arr[i] > c){
					c = arr[i];
				}
			}
			float sol = (float)((c*k)/1000.0);
			
			System.out.println((int)Math.ceil(sol));

	}
}
