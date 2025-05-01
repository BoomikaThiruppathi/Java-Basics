import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 int n = scn.nextInt();
	 System.out.print("Fibonacci series upto "+n+" terms : ");
	 int first = 0;
	 int second = 1;
	 for(int i = 0;i < n;i ++)
	 {
	     System.out.print(first + " ");
	     int next = first + second;
	     first = second;
	     second = next;
	 }
	}
}
