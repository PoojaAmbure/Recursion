import java.util.*;
public class Recur4 {

    public static int calFact(int n) {
        if(n ==1)
        {
            return 1;
        }

        int fact_nm1 = calFact(n-1);
        int factn = n * fact_nm1;
        return factn;
    }

    public static void main(String[] args) {
        int n=5;
        int ans = calFact(n);
        System.out.print(ans);
    }
}
