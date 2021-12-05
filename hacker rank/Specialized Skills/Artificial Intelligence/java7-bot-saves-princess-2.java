import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static void nextMove(int n, int r, int c, String [] grid){
    int cPos = 0;
    int rPos = 0;
    boolean hasPosition = false;
    for (int i=0; i<n && hasPosition==false; i++){
        if(grid[i].indexOf('p')>=0) {
            rPos = i;
            cPos = grid[i].indexOf('p');
            hasPosition = true;
        }
    }
    if (Math.abs(cPos-c)>0 || Math.abs(rPos-r)>0){
        if (Math.abs(c-cPos)>Math.abs(r-rPos)) {
            if(c>cPos) {System.out.println("LEFT");c--;}
            if(c<cPos) {System.out.println("RIGHT");c++;}
        }
        else {
            if(r>rPos) {System.out.println("UP");r--;}
            if(r<rPos) {System.out.println("DOWN");r++;}
        }
    }
  }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

    nextMove(n,r,c,grid);

    }
}