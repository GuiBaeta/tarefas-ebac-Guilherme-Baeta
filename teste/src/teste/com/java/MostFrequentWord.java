package teste.com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostFrequentWord {
	 public static String mostCommonWord(String paragraph, String[] banned) {
	        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
	        String normalizedStr = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();

	        String[] words = normalizedStr.split("\\s+");


	        Map<String, Integer> wordCount = new HashMap<>();

	        for (String word : words) {
	            if (!bannedSet.contains(word)) {
	                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	            }
	        }

	        String mostFrequent = "";
	        int maxCount = 0;
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                mostFrequent = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }

	        return mostFrequent;
	    }

	    public static void main(String[] args) {
	        // Exemplo 1
	        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
	        String[] banned1 = {"hit"};
	        System.out.println(mostCommonWord(paragraph1, banned1)); // Saída: "ball"

	        // Exemplo 2
	        String paragraph2 = "a.";
	        String[] banned2 = {};
	        System.out.println(mostCommonWord(paragraph2, banned2)); // Saída: "a"
	    }
}
