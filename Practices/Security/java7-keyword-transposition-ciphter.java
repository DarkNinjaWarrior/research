import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String alphaStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    static String deDuplicated(String keywordStr){
        String outputStr = "";
        if (keywordStr.length()>1){
            outputStr = keywordStr.substring(0,1);
            for (int i=1; i<keywordStr.length(); i++){
                if (outputStr.indexOf(keywordStr.charAt(i))<0) {
                    outputStr += keywordStr.charAt(i);
                }
            }
        }
        else {outputStr=keywordStr;}
        return outputStr;
    }
    
    static String getOrders(String origString, String newString){
        String outputString = "";
        for (int i=0; i<newString.length(); i++){
            outputString += origString.indexOf(newString.charAt(i));
        }
        return outputString;
    }
    
    static String getAlphabetMap(int cLen, String keywordStr){
        String mapStr = deDuplicated(keywordStr+"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int rLen = mapStr.length() % cLen + mapStr.length()/cLen;
        char[] charArr = keywordStr.toCharArray();
        Arrays.sort(charArr);
        String newString = new String(charArr);
        String orderStr = getOrders(keywordStr, newString);
        int[] orders = new int[orderStr.length()];
        for (int i=0; i<orderStr.length(); i++){
            orders[i]=Integer.parseInt(""+orderStr.charAt(i)+"");
        }
        String[][] origMatrix = new String[rLen][cLen];
        String[][] cloneMatrix = new String[rLen][cLen];
        for (int i=0; i<rLen; i++){
            for (int j=0; j<cLen; j++){
                origMatrix[i][j]="";
                cloneMatrix[i][j]="";
            }
        }
        String[][] newMatrix = new String[cLen][rLen];
        for (int i=0; i<rLen && mapStr.length()>0; i++){
            for(int j=0; j<cLen && mapStr.length()>0; j++){
                if (mapStr.length()>1){
                    origMatrix[i][j]=mapStr.substring(0,1); 
                    mapStr=mapStr.substring(1);
                }
                else if (mapStr.length()==1){
                    origMatrix[i][j]=mapStr;
                    mapStr = "";
                }
            }
        }
        for (int i=0; i<rLen; i++){
            for (int j=0; j<cLen; j++){
                int N = orders[j];
                if (origMatrix[i][N].length()>0){cloneMatrix[i][j] = origMatrix[i][N];}
                else {cloneMatrix[i][j] = "";}
            }
        }
        for (int i=0; i<cLen; i++){
            for(int j=0; j<rLen; j++){
                newMatrix[i][j] = cloneMatrix[j][i];
            }
        }
        for (int i=0; i<cLen; i++){for (int j=0; j<rLen; j++){mapStr += newMatrix[i][j];}}
        return mapStr;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int countOfTestCase = scan.nextInt();
        scan.nextLine();
        String[] keywordStr = new String[countOfTestCase];
        int[] keywordLen = new int[countOfTestCase];
        String[] cipherText = new String[countOfTestCase];
        
        for (int i=0; i<countOfTestCase; i++){
            keywordStr[i] = deDuplicated(scan.nextLine());
            keywordLen[i] = keywordStr[i].length();
            String cipherMap = getAlphabetMap(keywordLen[i],keywordStr[i]);
            cipherText[i] = scan.nextLine();
            for (int j=0; j<cipherText[i].length(); j++){
                if (cipherText[i].charAt(j)==' '){System.out.print(" ");}
         else{System.out.print(alphaStr.charAt(cipherMap.indexOf(cipherText[i].charAt(j))));}
            }
            System.out.println();
        }
        
        scan.close();
    }
}