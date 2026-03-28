int totalWeight = 0;
    String vowels = "aeiouAEIOU";

    for (int i = 0; i < input1.length(); i++) {
        char ch = input1.charAt(i);

        // Rule 1: Only process alphabetic characters
        if (Character.isLetter(ch)) {
            boolean isVowel = vowels.indexOf(ch) != -1;

            // Rule 2 & 5: If input2 is 0, ignore vowels
            if (input2 == 0 && isVowel) {
                continue;
            }

            // Rule 4: Calculate weight (a=1, b=2... z=26)
            char lowerCh = Character.toLowerCase(ch);
            int weight = lowerCh - 'a' + 1;
            totalWeight += weight;
        }
    }
    // Rule 6: Return the final calculated sum
    return totalWeight;
}
