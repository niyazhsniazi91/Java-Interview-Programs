package javaprograms;

public class RemoveAllVowelsFromString 
{
	public static void main(String[] args) 
	{
		String nameString = "Niyaz Hussain Siddiqui";
		nameString = nameString.replaceAll("[AEIOUaeiou]", "");
		System.out.println(nameString);
	}
}
