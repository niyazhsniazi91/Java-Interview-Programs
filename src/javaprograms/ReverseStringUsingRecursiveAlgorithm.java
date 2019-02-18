package javaprograms;

public class ReverseStringUsingRecursiveAlgorithm 
{
	String reverse = "";
    
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
    	ReverseStringUsingRecursiveAlgorithm rsura = new ReverseStringUsingRecursiveAlgorithm();
        System.out.println("Result: "+rsura.reverseString("Java2novice"));
    }
}
