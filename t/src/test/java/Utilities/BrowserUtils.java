package Utilities;

public class BrowserUtils {
    public static void WaitFor(int seconds){
        try {
        Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }
}
