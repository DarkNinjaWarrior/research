import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int[] nums = new int[N];
        boolean isBijective = true;
        for (int i=0; i<N; i++){nums[i]=scan.nextInt();}
        Arrays.sort(nums);
        for (int i=0; i<N; i++){if (nums[i]!=i+1){isBijective=false;}}
        if (isBijective) {System.out.println("YES");}
        else {System.out.println("NO");}
        scan.close();
    }
}