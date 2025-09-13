import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        String vowels = "aeiou";

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxVowel = 0, maxConsonant = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (vowels.indexOf(ch) != -1) {
                maxVowel = Math.max(maxVowel, freq);
            } else {
                maxConsonant = Math.max(maxConsonant, freq);
            }
        }

        return maxVowel + maxConsonant;
    }
}
