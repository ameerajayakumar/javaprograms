/*
Alice wants to go to Bob's house. The location of their houses is given on a 2-D coordinate system. There are a total of 8 directions:
North - Directly above
South - Directly below
East - To the right
West - To the left
North East - In between north and east
North West - In between north and west
South East - In between south and east
South West - In between south and west
Find the direction in which Alice must go to reach Bob's house.
Input
There are two lines of input. The first line contains the x and y coordinate of Alice's house. The second line contains x and y coordinate of Bob's house. It is given that these two locations are different.

-100 <= Coordinates <= 100
Output
Print a single string denoting the direction in which Alice must move to reach Bob's house. */

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Direction {
	public static void main (String[] args) {
                      // Your code here
					  Scanner s = new Scanner(System.in);
					 int x= s.nextInt();
					 int y= s.nextInt();
					 int a= s.nextInt();
					 int b= s.nextInt();
					 if(x<a){
						 if(y<b){
							 System.out.println("North East");
						 }
						 else if(y>b){
							 System.out.println("South East");
						 }
						 else{
							 System.out.println("East");
						 }
					 }
					 else if(x>a){
						 if(y<b){
							 System.out.println("North West");
						 }
						 else if(y>b){
							 System.out.println("South West");
						 }
						 else{
							 System.out.println("West");
						 }
					 }
					 else{
						 if(y<b){
							 System.out.println("North");
						 }
						 else{
							 System.out.println("South");
						 }
					 }

	}
}