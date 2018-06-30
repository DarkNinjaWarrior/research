import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i=0; i<N; i++){
            String inStr = scan.nextLine();
            boolean b = inStr.matches("^[Hh][Ii][\\s][^Dd](.*)");
            if(b){System.out.println(inStr);}
        }
    }
}