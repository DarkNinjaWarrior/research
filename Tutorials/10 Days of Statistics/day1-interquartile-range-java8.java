import java.io.*;
import java.util.*;

public class Solution {

    static int getMedianNum(int[] nums){
        int result = 0;
        if(nums.length % 2 != 0) {int medNum = Math.round(nums.length/2); result=nums[medNum];}
        else {int medNum = Math.round(nums.length/2); result=Math.round((nums[medNum-1]+nums[medNum])/2);}
        return result;
    }
    
    static int getArrayTotalLength(int[] nums){
        int result = 0;
        for (int i=0; i<nums.length; i++) {result += nums[i];}
        return result;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] intArrayE = new int[N], intArrayF = new int[N];
        scan.nextLine();
        for(int i=0; i<N; i++){intArrayE[i]=scan.nextInt();}
        scan.nextLine();
        for(int i=0; i<N; i++){intArrayF[i]=scan.nextInt();}
        int L = getArrayTotalLength(intArrayF);
        int[] intArrays = new int[L];
        int Count = 0;
        for (int i=0; i<N; i++){
            for (int j=0; j<intArrayF[i]; j++){
                intArrays[Count] = intArrayE[i];
                Count++;
            }
        }
        int midL = Math.round(L/2); 
        double numQ1 = 0, numQ2 = 0, numQ3 = 0;
        Arrays.sort(intArrays);
        if(L % 2 > 0){
            int[] numsL = new int[(L-1)/2],numsU = new int[(L-1)/2];
            for (int i=0; i<midL; i++) {numsL[i]=intArrays[i]; numsU[i]=intArrays[i+midL+1];}
            numQ1 += getMedianNum(numsL);
            numQ2 += intArrays[midL];
            numQ3 += getMedianNum(numsU);
        }
        else if (L % 2 ==0){
            int[] numsL = new int[midL],numsU = new int[midL];
            for (int i=0; i<midL; i++) {numsL[i]=intArrays[i]; numsU[i]=intArrays[i+midL];}
            numQ1 += getMedianNum(numsL);
            numQ2 += getMedianNum(intArrays);
            numQ3 += getMedianNum(numsU);
        }
        System.out.println(numQ3-numQ1);
        scan.close();
    }
}