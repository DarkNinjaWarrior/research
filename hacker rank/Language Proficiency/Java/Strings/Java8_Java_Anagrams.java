import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result=true;
        if (a.length()==b.length()) {
            for (int i=0; i<26 && result==true;i++){
                int la = charCount(i, a);
                int lb = charCount(i, b);
                if (la>lb || lb>la) {result=false;}
            }
        }
        else {result=false;}
        return result;
    }

    static int charCount(int a, String s) {
        int r=0;
        char c1= (char)(a+65), c2=(char)(a+97);
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)==c1 || s.charAt(i)==c2) r++;
        }
        return r;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
