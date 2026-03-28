int[] freq = new int[10];
    int[] inputs = {input1, input2, input3, input4};

    for (int num : inputs) {
        // Handle 0 specifically (if the input is exactly 0)
        if (num == 0) {
            freq[0]++;
        } else {
            // Take absolute value to handle negative numbers if any
            int temp = Math.abs(num);
            while (temp > 0) {
                int digit = temp % 10;
                freq[digit]++;
                temp /= 10;
            }
        }
    }

    int maxFreq = -1;
    int resultDigit = 0;

    // Iterate through freq array to find the most frequent digit
    for (int d = 0; d <= 9; d++) {
        // Using >= ensures that if frequencies are equal, 
        // the higher digit 'd' will overwrite the previous resultDigit.
        if (freq[d] >= maxFreq) {
            maxFreq = freq[d];
            resultDigit = d;
        }
    }

    return resultDigit;
}
Logic Hig
