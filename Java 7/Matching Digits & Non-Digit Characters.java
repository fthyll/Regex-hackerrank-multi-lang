import java.io.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine().trim();
        Pattern r = Pattern.compile("\\d{2}\\D\\d{2}\\D\\d{4}");
        Matcher m = r.matcher(test);
        if (m.find()) System.out.println("True");
        else System.out.println("False");
    }
}