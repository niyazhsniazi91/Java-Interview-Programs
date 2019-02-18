package javaprograms;

import java.io.IOException;

public class LaunchParticularFile 
{
	public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
        try
        {
            runtime.exec("notepad E:/Folder Lock with High Encryption and Backup.txt");        //opens "sample.txt" in notepad
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
