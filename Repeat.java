/*Given an array A of N integers, find whether there exists three consecutive same integers in the array.
Input
The first line of the input contains an integer N.
The second line contains N space separated integers of the array A.

Constraints
3 <= N <= 1000
1 <= A[i] <= 100
Output
Output "Yes" if there exists three consecutive equal integers in the array, else output "No" (without quotes). */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Repeat {
	static boolean repeat(int a[], int n){
		if(n>=3){
			for(int i=1;i<n-1;i++){
				if(a[i]==a[i-1] && a[i]==a[i+1]){
					return true;
				}

			}
		}
		return false;
	}
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();

		}
		if(repeat(arr,n)){
			System.out.println("Yes");
		}
		else{
		 	System.out.println("No");
		}
	}
}