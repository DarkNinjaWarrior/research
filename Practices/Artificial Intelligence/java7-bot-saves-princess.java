import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static void displayPathtoPrincess(int n, String [] grid){
    int m_x = 0, m_y = 0;
    int p_x = 0, p_y = 0;
    for(int i=0; i<n; i++){
        if(grid[i].indexOf('p')>=0){
            p_y = i;
            p_x = grid[i].indexOf('p');  
        }
        if(grid[i].indexOf('m')>=0){
            m_y = i;
            m_x = grid[i].indexOf('m');
        }
    }
    boolean isSolved = false;
    while (isSolved!=true){
        if (m_x - p_x > 0){m_x--; System.out.println("LEFT");}
        if (m_x - p_x < 0){m_x++; System.out.println("RIGHT");}
        if (m_y - p_y > 0){m_y--; System.out.println("UP");}
        if (m_y - p_y < 0){m_y++; System.out.println("DOWN");}
        if (m_x==p_x && m_y==p_y) {isSolved=true;}
    }
  }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}