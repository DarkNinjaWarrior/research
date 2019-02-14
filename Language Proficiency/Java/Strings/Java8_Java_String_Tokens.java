import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            String[] str = s.trim().split("[^A-Za-z]+");
            if (str.length == 0 || str == null || s.replaceAll(" ", "").length()<1) {
                System.out.println("0");
            } else if (str.length > 400000) {
                return;
            } else {
                System.out.println(str.length);
                for (int i = 0; i < str.length; i++) {
                    System.out.println(str[i]);
                }
                scan.close();
            }
        }
        catch(Exception e){
            System.out.println("0");}
    }
}

