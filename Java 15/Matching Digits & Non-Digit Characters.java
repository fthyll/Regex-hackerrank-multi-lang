import java.io.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String test = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        Pattern r = Pattern.compile("\\d{2}\\D\\d{2}\\D\\d{4}");
        Matcher m = r.matcher(test);
        System.out.println(m.find() ? "True" : "False");
    }
}