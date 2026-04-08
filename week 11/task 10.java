import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int isColorful(int A) {
        HashSet<Long> hashSet = new HashSet<>();
        ArrayList<Integer> digits = new ArrayList<>();
        
        // Handle 0 explicitly if needed, though constraints say A >= 0
        if (A == 0) return 1;

        // Extract digits
        while (A > 0) {
            digits.add(A % 10);
            A /= 10;
        }
        Collections.reverse(digits);

        int n = digits.size();
        for (int i = 0; i < n; i++) {
            long product = 1;
            for (int j = i; j < n; j++) {
                product *= digits.get(j);
                
                // If product already exists, it's not a colorful number
                if (hashSet.contains(product)) {
                    return 0;
                }
                hashSet.add(product);
            }
        }
        return 1;
    }
}
