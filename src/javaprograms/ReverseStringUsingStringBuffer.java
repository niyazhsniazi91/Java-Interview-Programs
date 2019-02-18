package javaprograms;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String that you want to reverse: ");
		String inputString = sc.nextLine();
		StringBuffer sb = new StringBuffer(inputString);
		System.out.println("Reverse String: " + sb.reverse());
		sc.close();
	}

}
