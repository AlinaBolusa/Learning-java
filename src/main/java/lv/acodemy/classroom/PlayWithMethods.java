package lv.acodemy.classroom;

public class PlayWithMethods {
    public static void main(String[] args) {
        // void method that returns something
        greeting("Alina");
        var x = add(10, 20);
        System.out.println(x);
        System.out.println(add(30, 40));
        // check if number is even
        System.out.println(isEven(10));
        System.out.println(isEven(14));
        System.out.println(isEven(12));
        System.out.println(isEven(19));

        System.out.println(findMax(40, 30));

        // check if a word is palindrome
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int findMax(int numberOne, int numberTwo) {
        return (numberOne >= numberTwo) ? numberOne : numberTwo;
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return word.equals(reversedWord);
    }
}




