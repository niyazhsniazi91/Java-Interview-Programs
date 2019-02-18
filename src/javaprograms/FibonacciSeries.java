package javaprograms;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter positive number :");
        
        int inputNumber = sc.nextInt();
        
        int firstTerm = 0;
        
        int secondTerm = 1;
        
        int thirdTerm = 0;
        
        while (thirdTerm < inputNumber)
        {
            thirdTerm = firstTerm + secondTerm;
            
            firstTerm = secondTerm;
            
            secondTerm = thirdTerm;
        }
        
        if(thirdTerm == inputNumber)
        {
            System.out.println(inputNumber + " belongs to Fibonacci series");
        }
        else
        {
            System.out.println(inputNumber + " doesn't belongs to Fibonacci series");
        }
        sc.close();
    }
}
