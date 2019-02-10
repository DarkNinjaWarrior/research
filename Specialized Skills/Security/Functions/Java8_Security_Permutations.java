import java.io.*;
import java.util.*;

public class Solution {
   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        scan.nextLine();
        for (int i=0; i<N; i++){nums[i]=scan.nextInt();}
        for (int i=0; i<N; i++){
            System.out.println(nums[nums[i]-1]);
        }
        scan.close();
    }
}