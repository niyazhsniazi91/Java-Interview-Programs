package javaprograms;

public class LaunchAndCloseAudioVedio 
{
	public static void main(String[] args) throws Exception
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
        String[] s = new String[] {"C:/Program Files (x86)/VideoLAN/VLC/vlc.exe", "E:\\vid.mp4"};
        Process process = runtime.exec(s);        //opens "sample.mp3" in VLC Media Player
        Thread.sleep(10000);
        process.destroy();
    }
}
