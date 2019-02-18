package javaprograms;

public class WhiteSpacesRemovalFromString 
{
	public static void main(String[] args) 
	{
		String nameString = "Niyaz Hussain Siddiqui";
		nameString = nameString.replaceAll("[ ]", "");
		System.out.println(nameString);
	}
}
