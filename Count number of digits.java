import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 int num = scn.nextInt();
	 System.out.println(countdigits(num));
	 
	
	}
	public static int countdigits(int num){
	    int count = 0;
	    while(num > 0){
	        count ++;
	        num /= 10;
	    }
	    return count;
	    
	}
}
