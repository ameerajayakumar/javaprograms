
/*
Given two positive integers N and X, where N is the number of total patients and X is the time duration (in minutes) after which a new patient arrives. Also, doctor will give only 10 minutes to each patient. The task is to calculate the time (in minutes) the last patient needs to wait.
Input
The first line of input contains the number of test cases T. The next subsequent lines denote the total number of patients N and time interval X (in minutes) in which the next patients are visiting.

Constraints:
1 <= T <= 100
0 <= N <= 100
0 <= X <= 30
Output
Output the waiting time of last patient.

*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Doctor {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int total, td;
        for (int i = 0; i < tc; i++) {
            total = sc.nextInt();
            td = sc.nextInt();
            if (td > 10)
                System.out.println(0);
            else
                System.out.println((total - 1) * (10 - td));
        }

    }

}