import java.io.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine().trim();
        Pattern r = Pattern.compile("...");
        Matcher m = r.matcher(test);
        System.out.println(m.find() ? "True" : "False");
    }
}