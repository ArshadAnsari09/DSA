package recursion3;

public class PrintSubsequences {
    public static void printSubsequences(String input,String outputSoFar){
       if(input.length()==0){
           System.out.println(outputSoFar);
           return;
       }

       //we choose not to include first character
       printSubsequences(input.substring(1),outputSoFar);

        //we choose  to include first character
        printSubsequences(input.substring(1),outputSoFar+input.charAt(0));
    }

    public static void printSubsequences(String input){
        printSubsequences(input," ");
    }
    public static void main(String[] args) {
        String str="xyz";
        printSubsequences(str);
    }
}
