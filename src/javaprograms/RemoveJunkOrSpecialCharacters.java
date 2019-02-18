package javaprograms;

public class RemoveJunkOrSpecialCharacters 
{
	public static void main(String[] args) 
	{
		String nameString = "%##^%$Niyaz &^%&^%^%Hussain &%^%Siddiqui %&^%7676515177";
		nameString = nameString.replaceAll("[^ a-zA-Z0-9]", "");
		System.out.println(nameString);
	}
}
