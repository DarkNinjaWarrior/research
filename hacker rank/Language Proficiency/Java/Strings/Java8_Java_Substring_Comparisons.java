import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int l = s.length();
        String[] str = new String[l-k+1];
        for(int i=0;i<l-k+1;i++) {
            str[i]=s.substring(i,i+k); 
            //s = s.substring(1);
            //System.out.print(str[i].toString()+" ");
            }
        for(int i=0; i<l-k+1; i++) {
            for (int j=i+1; j<l-k+1; j++){
                if (str[i].compareTo(str[j])>0) {
                    String tempStr = str[i];
                    str[i] = str[j];
                    str[j] = tempStr;
                }
            }
        }
        smallest = str[0];
        largest = str[l-k];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}