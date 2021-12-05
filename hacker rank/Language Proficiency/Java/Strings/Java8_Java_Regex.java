import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{

    public static String pattern = "([0-1]{0,1}[0-9]{1,2}|[2]{1}[0-4]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]([0-1]{0,1}[0-9]{1,2}|[2]{1}[0-4]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]([0-1]{0,1}[0-9]{1,2}|[2]{1}[0-4]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})[.]([0-1]{0,1}[0-9]{1,2}|[2]{1}[0-4]{1}[0-9]{1}|[2]{1}[5]{1}[0-5]{1})";

}
