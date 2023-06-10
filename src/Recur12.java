import java.util.HashSet;

public class Recur12 {

    public static void subsequences(String str, int indx, String newStr , HashSet<String> set){
        if(indx == str.length()){
            if(set.contains(newStr)){
                return;
            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(indx);

        subsequences(str, indx+1, newStr+currChar, set);

        subsequences(str, indx+1, newStr, set);
    }

    public static void main(String[] args) {
        String str ="aaa";
        HashSet<String> set= new HashSet<>();

        subsequences(str , 0,"", set);
    }
}
