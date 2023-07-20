import java.util.Scanner;

public class Palindrome_rec {
    static int palindrome(String word,int start,int end){
        if(start>end)
        {
            return 1;
        }

        if(word.charAt(start)!=word.charAt(end)){
            return 0;
        }
        return palindrome(word,start+1,end-1);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        System.out.println(palindrome(word,0,word.length()-1));
    }
}
