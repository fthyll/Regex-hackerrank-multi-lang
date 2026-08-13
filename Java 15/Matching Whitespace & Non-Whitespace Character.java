import java.io.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String test = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        Pattern r = Pattern.compile("\\S+\\s\\S+\\s\\S+");
        Matcher m = r.matcher(test);
        System.out.println(m.find() ? "True" : "False");
    }
}