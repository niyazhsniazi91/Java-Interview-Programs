package javaprograms;

import java.util.Scanner;

public class ReverseStringUsingForLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String that you want to reverse: ");
		String inputString = sc.nextLine();
		int stringLength = inputString.length();
		String reverseString = "";
		
		for (int i = stringLength-1; i >= 0; i--) 
		{
			reverseString = reverseString + inputString.charAt(i);
		}
		System.out.println("Reverse String: " + reverseString);
		sc.close();
	}
}
