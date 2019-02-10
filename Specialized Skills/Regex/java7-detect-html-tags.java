import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); 
        String outputStr = "";
        scan.nextLine();
        
        for (int i=0; i<N; i++){
            String inputStr = scan.nextLine();
            boolean foundTag = inputStr.matches("(.*)[\\<]\\w+[\\s\\>](.*)");
            while(foundTag){
                int startPt = inputStr.indexOf("<");
                int stopPt1 = inputStr.substring(startPt).indexOf(">");
                int stopPt2 = inputStr.substring(startPt).indexOf(" ");
                int stopPt = -1;
                if (stopPt2<=0){stopPt = stopPt1;}
                else {stopPt = Math.min(stopPt1,stopPt2);}
                String tagStr = inputStr.substring(startPt+1, startPt+stopPt);
                if (tagStr.charAt(0)=='/') {tagStr = tagStr.substring(1);}
                //if (outputStr.indexOf(tagStr.toLowerCase())<0){
                    if (outputStr.length()<=0){outputStr = tagStr.toLowerCase();}
                    else {outputStr += ";"+tagStr.toLowerCase();}
                //}
                inputStr = inputStr.substring(startPt+stopPt);
                foundTag = inputStr.matches("(.*)[\\<]\\w+[\\s\\>](.*)");
            }
        }
        
        int moreThanOne = outputStr.indexOf(';');
        if (moreThanOne>0){
            String[] arrayStr = outputStr.split("\\;");
            Arrays.sort(arrayStr);
            String ptStr = new String();
            for (int i=0; i<arrayStr.length; i++){
                if (i==0) {
                    System.out.printf(arrayStr[i]);
                    ptStr = arrayStr[i];
                }
                else if (i==arrayStr.length-1) {
                    if (!arrayStr[i].equals(ptStr)){
                        System.out.println(";"+arrayStr[i]);
                    }
                }
                else {
                    if (!arrayStr[i].equals(ptStr)){
                        System.out.printf(";"+arrayStr[i]); 
                        ptStr = arrayStr[i];
                    }
                }
            }
        }
        else {System.out.println(outputStr);}
               
        scan.close();
    }
}