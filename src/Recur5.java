import java.util.*;

public class Recur5 {

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {
       int a =0, b=1;
        int n = 7;
        System.out.print(a+" ");
        System.out.print(b+" ");
        printFib(0, 1, n - 2);
    }
}
