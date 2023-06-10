import java.util.*;

public class Recur9 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccur(String str, int indx, char element) {
        char currChar = str.charAt(indx);
        if (currChar == element) {
            if (first == -1) {
                first = indx;
                return;
            } else {
                last = indx;
                return;
            }
        }
        findOccur(str, indx + 1, element);

    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccur(str, 0, 'a');
    }
}