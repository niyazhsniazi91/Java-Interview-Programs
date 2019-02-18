package javaprograms;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal Number: ");
		int number = sc.nextInt();
		int binary[] = new int[number];
		String binaryNumber = "";
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            binaryNumber = binaryNumber + binary[i];
        }
        System.out.print("Binary Number: " + binaryNumber);
        sc.close();
	}
}
