package org.adrian.com.wordCount;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+(?:'[a-zA-Z]+)?|\\d+");
        Map<String, Integer> words = new HashMap<>();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            if (!words.containsKey(word)) {
                words.put(word,1);
            } else {
                words.put(word,words.get(word) + 1);
            }
        }

        return words;
    }
}
