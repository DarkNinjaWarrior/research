import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int B;
    static int H;
    static boolean flag;
    static {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B<=0 || H<=0) {
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
        else flag=true;
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

