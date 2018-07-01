import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int[] nums = new int[N];
        int sumNums = 0;
        for (int i=0; i<N; i++){nums[i]=scan.nextInt(); sumNums += nums[i];}
        double std = 0;
        for (int i=0; i<N; i++){std += Math.pow(nums[i]-(sumNums/N),2);}
        std = Math.round(Math.sqrt(std/N)*10.0)/10.0;
        System.out.println(std);
        scan.close();
    }
}