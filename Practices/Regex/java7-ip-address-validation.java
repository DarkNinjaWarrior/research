import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String IPv4 = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
        String IPv6 = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";
        Pattern ipv4 = Pattern.compile(IPv4);
        Pattern ipv6 = Pattern.compile(IPv6);
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i=0; i<N; i++){
        String input = scan.nextLine();
        if (ipv4.matcher(input).matches()) {
            System.out.println("IPv4");
        } else if (ipv6.matcher(input).matches()) {
            System.out.println("IPv6");
        } else {
            System.out.println("Neither");
        }
        }          
    }
}