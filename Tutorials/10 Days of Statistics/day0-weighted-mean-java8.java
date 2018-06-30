import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int[] intArrayX = new int[N],intArrayW = new int[N];
        while (scan.hasNextInt()){
            for (int i=0; i<N; i++){intArrayX[i]=scan.nextInt();}
            scan.nextLine();
            for (int j=0; j<N; j++){intArrayW[j]=scan.nextInt();}
        }
        double sum1=0.0,sum2=0.0,result=0.0;
        for (int i=0; i<N; i++){sum1+=intArrayX[i]*intArrayW[i];sum2+=intArrayW[i];}
        if(sum2!=0) {result=Math.round(sum1/sum2*10.0)/10.0;}
        System.out.println(result);
    }
}