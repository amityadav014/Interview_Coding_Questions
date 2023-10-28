//Java Program To Count Occurrences Of Each Character In String

import java.util.HashMap;
import java.util.Map;

public class EachCharCountInString
{

    public static void main(String[] args) {
      String inputString = "hello world43r3rfsvv ";

      // Remove spaces and convert the string to lowercase for accurate counting
      inputString = inputString.replaceAll("\\s", "").toLowerCase();

      // Create a HashMap to store characters and their occurrences
      Map<Character, Integer> charOccurrences = new HashMap<>();

      // Iterate through the characters in the input string
      for (char c : inputString.toCharArray()) {
        // If the character is already in the map, increment its count
        if (charOccurrences.containsKey(c)) {
          charOccurrences.put(c, charOccurrences.get(c) + 1);
        } else {
          // If the character is not in the map, add it with a count of 1
          charOccurrences.put(c, 1);
        }
      }

      // Print character occurrences
      System.out.println(inputString+" : "+charOccurrences);
      }
    }

