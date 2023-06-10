import java.util.*;

public class Recur7 {
    public static void towOfHanoi(int n , String src, String helper , String dest)
    {
        if(n == 1)
        {
            System.out.println("Transfer disk "+ n +" from " + src + " to " + dest + " ");
            return;
        }
        towOfHanoi(n-1 , src, dest, helper);
        System.out.print("  Transfer disk "+ n +" from " + src + " to " + dest +" ");
        towOfHanoi(n-1 , helper ,  src , dest);
    }

    public static void main(String[] args) {
        int n=3;
        towOfHanoi(n , "S" ,"H" , "D");
    }
}
