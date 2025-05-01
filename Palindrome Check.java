import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 String str = scn.next();
	 int start  = 0;
	 int end = str.length()-1;
	 boolean ispalindrome = true;
	 while(start < end){
	     if(str.charAt(start) != str.charAt(end))
	     {
	         ispalindrome = false;
	         break;
	     }
	     start ++;
	     end --;
	 }
	 if(ispalindrome){
	     System.out.println("The given word is Palindrome");
	 }
	 else{
	     System.out.println("The given word is not a Palindrome");
	 }
	}
}
