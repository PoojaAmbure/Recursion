public class Recur11 {

    public static void subsequences(String str, int indx, String newString){
        if(indx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indx);

        //to be in the str
        subsequences(str , indx+1, newString+currChar);

        // not to be in string
        subsequences(str , indx+1, newString);
    }

    public static void main(String[] args) {
        String str= "abc";
        subsequences(str , 0 ," ");
    }
}
