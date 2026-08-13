import java.io.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine().trim();
        Pattern r = Pattern.compile("hackerrank");
        Matcher m = r.matcher(test);
        int count = 0;
        while (m.find()) count++;
        System.out.println("Number of matches : " + count);
    }
}