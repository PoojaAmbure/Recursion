import java.util.*;

public class Recur8 {
    public static void printRev(String str, int indx) {
        if (indx == 0) {
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printRev(str,indx-1);
    }

    public static void main(String[] args) {
        String str ="abcd";
        int indx = 3;
        printRev(str, str.length()-1);
    }
}
