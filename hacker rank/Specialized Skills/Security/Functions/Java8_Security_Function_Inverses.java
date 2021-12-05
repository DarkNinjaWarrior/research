import java.io.*;
import java.util.*;

public class Solution {
    
    static int[] arrayInvert(int[] intArray){
        int[] newIntArray = new int[intArray.length];
        for(int i=0; i<intArray.length; i++){
            for(int j=0; j<intArray.length; j++){if (intArray[j]==i+1){newIntArray[i]=j+1;}}
        }
        return newIntArray;
    }
    
    static void printArray(int[] intArray){
        for (int i=0; i<intArray.length; i++){System.out.println(intArray[i]);}
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        scan.nextLine();
        for (int i=0; i<N; i++){
            nums[i] = scan.nextInt();
        }
        printArray(arrayInvert(nums));
        scan.close();
    }
}