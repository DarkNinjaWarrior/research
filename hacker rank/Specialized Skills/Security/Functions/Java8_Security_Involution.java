import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        scan.nextLine();
        int[] list = new int[len];
        for(int i=0;i<len;i++){list[i]=scan.nextInt();}
        boolean isContinue = true;
        boolean isValid = true;
        int p = 1;
        while (isContinue) {
            int v = list[p-1];
            if (p>list[v-1] || p<list[v-1]) {isContinue=false; isValid=false;}
            if (p == len) isContinue=false;
            else p++; 
        }
        if (isValid==true) System.out.print("YES");
        else  System.out.print("NO");
    }
}

