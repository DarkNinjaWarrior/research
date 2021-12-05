import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static void next_move(int posr, int posc, int dimh, int dimw, String[] board){
        //add logic here
        int nPosr=0; 
        int nPosc=0;
        double mDist=Math.pow(10, dimh*dimw);
        boolean isOnDirty = false;
        for (int r=0; r<dimh; r++){
            for (int c=0; c<dimw; c++){
                if (posr==r && posc==c && board[r].charAt(c)=='d') {
                    isOnDirty=true;
                }
                else if(board[r].charAt(c)=='d'){
                    double nDist = Math.sqrt(Math.pow(posr-r, 2)+Math.pow(posc-c,2));
                    if (nDist<mDist) {
                        nPosc = c;
                        nPosr = r;
                        mDist = nDist;
                    }
                    else if (nDist==mDist){
                        double nDist1 = getShortestDist(r,c,board);
                        double mDist1 = getShortestDist(nPosr,nPosc,board);
                        if (nDist1<mDist1) {nPosr=r; nPosc=c;}
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

static double getShortestDist(int posr, int posc, String[] board){
    int nPosr = 0;
    int nPosc = 0;
    double mDist = Math.pow(10, posr*posc);
    for (int r=0; r<board.length; r++){
        for (int c=0; c<board[r].length(); c++){
            if (board[r].charAt(c)=='d' && (posr!=r || posc!=c)){
                double nDist = Math.sqrt(Math.pow(posr-r,2)+Math.pow(posc-c,2));
                if (nDist<mDist) {
                    mDist = nDist;
                }
            }
        }
    }
    return mDist;
}

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        int [] dim = new int[2];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<2;i++) dim[i] = in.nextInt();
        String board[] = new String[dim[0]];
        for(int i=0;i<dim[0];i++) board[i] = in.next();
        next_move(pos[0], pos[1], dim[0], dim[1], board);
    }
}