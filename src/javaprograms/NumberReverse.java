package javaprograms;

import java.util.Scanner;

public class NumberReverse 
{
    public static void main(String a[])
    {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String that you want to reverse: ");
		int number = sc.nextInt();
    	int reverse = 0;
        int remainder;
        while(number != 0){
        	remainder = number % 10;
        	reverse = (reverse*10) + remainder;
            number = number/10;
        }
        System.out.println("Reverse Number: " + reverse);
        sc.close();
    }
}
