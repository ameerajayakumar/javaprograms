/*
Given an integer n, your task is to print a right angle triangle pattern of consecutive numbers of height n.

eg:-

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function pattern() that takes integer n as a parameter.

Constraint:
1 <= n <= 100
Output
Print a right angle triangle of numbers of height n.*/

class Pattern{
static void pattern(int n){
    //enter your code here
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.print(j+" ");
        }
        System.out.println();
    }
    }}