import java.io.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String test = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        Matcher m = Pattern.compile("hackerrank").matcher(test);
        long count = m.results().count();
        System.out.println("Number of matches : " + count);
    }
}