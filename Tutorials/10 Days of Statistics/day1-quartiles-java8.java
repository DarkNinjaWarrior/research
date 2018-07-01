import java.io.*;
import java.util.*;

public class Solution {
    
    static int getMedianNum(int[] nums){
        int result = 0;
        if(nums.length % 2 != 0) {int medNum = Math.round(nums.length/2); result=nums[medNum];}
        else {int medNum = Math.round(nums.length/2); result=Math.round((nums[medNum-1]+nums[medNum])/2);}
        return result;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        scan.nextLine();
        for(int i=0; i<N;i++){nums[i]=scan.nextInt();}
        int midN = Math.round(N/2); 
        int numQ1 = 0, numQ2 = 0, numQ3 = 0;
        Arrays.sort(nums);
        if(N % 2 > 0){
            int[] numsL = new int[(N-1)/2],numsU = new int[(N-1)/2];
            for (int i=0; i<midN; i++) {numsL[i]=nums[i]; numsU[i]=nums[i+midN+1];}
            numQ1 += getMedianNum(numsL);
            numQ2 += nums[midN];
            numQ3 += getMedianNum(numsU);
        }
        else if (N % 2 ==0){
            int[] numsL = new int[midN],numsU = new int[midN];
            for (int i=0; i<midN; i++) {numsL[i]=nums[i]; numsU[i]=nums[i+midN];}
            numQ1 += getMedianNum(numsL);
            numQ2 += getMedianNum(nums);
            numQ3 += getMedianNum(numsU);
        }
        System.out.println(numQ1);
        System.out.println(numQ2);
        System.out.println(numQ3);
        scan.close();
    }
}