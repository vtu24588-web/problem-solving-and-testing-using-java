public static int marsExploration(String s) {

    int changes = 0;

    for (int i = 0; i < s.length(); i++) {

        if (i % 3 == 0 && s.charAt(i) != 'S') {
            changes++;
        }
        else if (i % 3 == 1 && s.charAt(i) != 'O') {
            changes++;
        }
        else if (i % 3 == 2 && s.charAt(i) != 'S') {
            changes++;
        }
    }

    return changes;
}
