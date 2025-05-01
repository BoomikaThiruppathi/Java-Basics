import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int num = scn.nextInt();
	    int Originalnum = num;
	    int sum = 0;
	  
	    
	    int digit = 0;
	    int temp = num;
	    while(temp > 0){
	        temp/=10;
	        digit ++;
	    }
	    
	    temp = num;
	    while(temp > 0){
	        int digits = temp % 10;
	        int power = 1;
	        for(int i =0;i < digit;i ++){
	            power = power * digits;
	        }
	        sum = sum + power;
	        temp /= 10;
	        
	    }
	    if(sum == Originalnum){
	        System.out.print("The given number is an Armstrong number ");
	    }
	    else{
	        System.out.print("The given number is not an Armstrong number");
	    }
	}
}
