/* Given an array of N elements, your task is to update every element with multiplication of previous and next elements with following exceptions:-
a) First element is replaced by multiplication of first and second.
b) Last element is replaced by multiplication of last and second last.

See example for more clarity
Input
First line of input contains the size of array N, next line contains N space separated integers denoting values of array.

Constraints:-
2 < = N < = 100000
1 < = arr[i] < = 100000
Output
Print the modified array*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Replace {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			long arr[]=new long[(int)n];
			long arr2[]=new long[(int)n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			arr2[0]=arr[0]*arr[1];
				arr2[n-1]=arr[n-1]*arr[n-2];
			for(int i=1;i<n-1;i++)
			{
				
				arr2[i]=arr[i-1]*arr[i+1];
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(arr2[i]+" ");
			}	}
}