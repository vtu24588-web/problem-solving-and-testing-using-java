import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        
        int k = p.length();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String sortedP = new String(pArr);
        
        for (int i = 0; i <= s.length() - k; i++) {
            
            String sub = s.substring(i, i + k);
            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);
            
            if (sortedP.equals(new String(subArr))) {
                result.add(i);
            }
        }
        
        return result;
    }
}
