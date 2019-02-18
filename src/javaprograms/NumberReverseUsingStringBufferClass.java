package javaprograms;

import java.util.Scanner;

public class NumberReverseUsingStringBufferClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String that you want to reverse: ");
		int number = sc.nextInt();
        System.out.println(new StringBuffer(String.valueOf(number)).reverse());
		sc.close();
	}
}
