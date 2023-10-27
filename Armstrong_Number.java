public class Armstrong_Number {
    public static void main(String[] args) {
        int lowerLimit = 100;
        int upperLimit = 1000;
        findArmstrongNumbers(lowerLimit, upperLimit);
    }

    public static void findArmstrongNumbers(int lowerLimit, int upperLimit) {
        for (int number = lowerLimit; number <= upperLimit; number++) {
            int originalNumber = number;
            int sum = 0;
            int numberOfDigits = String.valueOf(number).length();

            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numberOfDigits);
                number /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            }
        }
    }
}








