public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String inputString = "hello";
        findDuplicateCharacters(inputString);
    }

    public static void findDuplicateCharacters(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Iterate through the character array with two loops
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                // If the characters at positions i and j are the same, it's a duplicate
                if (charArray[i] == charArray[j]) {
                    System.out.println("Duplicate character: " + charArray[i]);
                    break; // Break the inner loop to avoid printing the same duplicate multiple times
                }
            }
        }
    }
}
