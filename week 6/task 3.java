public static String twoStrings(String s1, String s2) {

    boolean[] seen = new boolean[26];

    // mark characters from s1
    for (char c : s1.toCharArray()) {
        seen[c - 'a'] = true;
    }

    // check s2
    for (char c : s2.toCharArray()) {
        if (seen[c - 'a']) {
            return "YES";
        }
    }

    return "NO";
}
