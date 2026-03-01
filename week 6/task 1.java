import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {


   public static long stringSimilarity(String s) {
    
    int n = s.length();
    int[] Z = new int[n];
    
    int left = 0, right = 0;
    
    for (int i = 1; i < n; i++) {
        
        if (i <= right) {
            Z[i] = Math.min(right - i + 1, Z[i - left]);
        }
        
        while (i + Z[i] < n && s.charAt(Z[i]) == s.charAt(i + Z[i])) {
            Z[i]++;
        }
        
        if (i + Z[i] - 1 > right) {
            left = i;
            right = i + Z[i] - 1;
        }
    }
    
    long total = n;  // use long
    
    for (int i = 1; i < n; i++) {
        total += Z[i];
    }
    
    return total;
}
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            long result = Result.stringSimilarity(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
