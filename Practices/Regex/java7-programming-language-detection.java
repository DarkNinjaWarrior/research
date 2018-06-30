import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        boolean isPython = true;
        while (scan.hasNextLine() && isPython){
            String inString = scan.nextLine();
            boolean isJava = inString.matches("[\\s]{0,}import[\\s][^\\;]{1,}[\\;]");
            boolean isCCode = inString.matches("[\\s]{0,}[\\#]include(.*)");
            if (isJava) {isPython=false; System.out.println("Java");}
            if (isCCode) {isPython=false; System.out.println("C");}
        }
        if (isPython) {System.out.println("Python");}
    }
}