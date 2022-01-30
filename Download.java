/*Internet download speed is often expressed in bit per second whereas file size is expressed in Bytes. It is known that 1 Byte = 8 bits. Given file size in megabytes(MB) and internet speed in megabits per seconds(Mbps), find the time taken in seconds to download the file.
Input
The only line of input contains two integers denoting the file size in MB and download speed in Mbps.

1 <= file size <= 1000
1 <= download speed <= 1000
Output
Print a single integer denoting the time taken to download the file in seconds.
It is guaranteed that the result will be an integer. */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Download {
	public static void main (String[] args) {
                      // Your code here
					  Scanner s = new Scanner(System.in);
					  int file = s.nextInt();
 int speed = s.nextInt();
 file = file*8;
 int sec = file/speed;
 System.out.println(sec);

	}
}