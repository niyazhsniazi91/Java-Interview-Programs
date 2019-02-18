package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class DeleteEvenNumberFromIntegerArray 
{
	static void sortList(){

		List <Integer> number=new ArrayList <Integer>();

		number.add(11);
		number.add(45);
		number.add(12);
		number.add(35);
		number.add(36);

		System.out.println("List with Even Numbers: "+number);

		for (int i=0;i<number.size();i++){      
			int even=number.get(i)%2;       
			if (even==0){
				System.out.println("This is Even Number:"+ number.get(i));
				number.remove(i);
			}    
		}
		System.out.println("List without Even Numbers: "+number);
	}

	public static void main(String[] args) 
	{
		sortList();
	}
}
