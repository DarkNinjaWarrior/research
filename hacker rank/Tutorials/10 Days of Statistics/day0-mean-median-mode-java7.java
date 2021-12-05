import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sumIntArray(int[] intArray){
        int sumOfArray=0;
        for (int i=0;i<intArray.length;i++){sumOfArray+=intArray[i];}
        return sumOfArray;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        scan.nextLine();
        for (int i=0; i<N && scan.hasNextInt(); i++){nums[i]=scan.nextInt();}
        Arrays.sort(nums);
        double meanNum = sumIntArray(nums)*1.0/N;
        System.out.println(meanNum);
        int mid = Math.round(nums.length/2);
        double medianNum = (nums[mid-1]+nums[mid])*1.0/2;
        int count = 0;
        int modeNum = 0;
        for (int i=0; i<N; i++){
            if (i==0) {modeNum=nums[i];}
            int count1 = 0;
            for (int j=0;j<N; j++){if (nums[i]==nums[j]){count1++;}}
            if (count1>count) {modeNum=nums[i];count=count1;}
            else if (count1==count) {if (nums[i]<modeNum){modeNum=nums[i];}}
        }
        System.out.println(medianNum);
        System.out.println(modeNum);
        scan.close();
    }
}