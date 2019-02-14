import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    static void patternCompile(String pattern){
        try{
            Pattern p = java.util.regex.Pattern.compile(pattern);
            System.out.println("Valid");
        }
        catch(Exception e){System.out.println("Invalid");}
    }

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              patternCompile(pattern);
              testCases--;
		}
	}
}



