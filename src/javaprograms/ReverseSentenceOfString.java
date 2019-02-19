package javaprograms;

public class ReverseSentenceOfString 
{
	static void reverseSentenceOfString(String inputString)
    {
		String[] split = inputString.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) 
		{
		  result += (split[i] + " ");
		}
        System.out.println(inputString);
        System.out.println("-------------------------");
        System.out.println(result);
    }
    
    public static void main(String[] args) 
    {
        reverseSentenceOfString("MY NAME IS NIYAZ");
    }
}
