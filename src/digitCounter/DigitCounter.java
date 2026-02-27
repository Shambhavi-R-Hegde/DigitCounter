package digitCounter;

import java.util.Scanner;

public class DigitCounter {
	
	public static void main(String [] args) {
		
		int count = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the number to count the number of digits in it : ");
		int number=sc.nextInt();
		int originalNumber=number;
		
		if(number==0) {
			count=1;
		}else {
			while(number!=0) {
				number/=10;
				count++;
			}
		}
		System.out.println("The total of digits in "+originalNumber+" is "+count);
		sc.close();
	}

}
