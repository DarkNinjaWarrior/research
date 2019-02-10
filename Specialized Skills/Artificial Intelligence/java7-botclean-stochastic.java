import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static void nextMove(int posr, int posc, String[] board){
        //add logic here
        int nPosr=0; 
        int nPosc=0;
        double mDist=0;
        boolean isOnDirty = false;
        for (int r=0; r<board.length; r++){
            for (int c=0; c<board[r].length();c++){
                if (posr==r && posc==c && board[r].charAt(c)=='d') {
                    isOnDirty=true;
                }
                else if(board[r].charAt(c)=='d'){
                    double nDist = Math.sqrt(Math.pow(posr-r, 2)+Math.pow(posc-c,2));
                    if (mDist==0 || nDist<mDist) {
                        nPosc = c;
                        nPosr = r;
                    }
                }
            }
        }
        if(isOnDirty){System.out.println("CLEAN");}
        else {
            if (Math.abs(posc-nPosc)>Math.abs(posr-nPosr)){
                if (posc<nPosc) {System.out.println("RIGHT");}
                else {System.out.println("LEFT");}
            }
            else {
                if (posr<nPosr) {System.out.println("DOWN");}
                else {System.out.println("UP");}
            }
        }
    }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        nextMove(pos[0], pos[1], board);
    }
}