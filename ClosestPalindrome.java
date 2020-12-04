package com.sizmek.amber.verification;

public class ClosestPalindrome {

    public static void main(String[] args) {
        int input = 100;
        System.out.println(closestPalindrome(input));
    }

    private static boolean isPalindrome(int input) {
        int palindrome = input;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return reverse == input;
    }

    private static int closestPalindrome(int input) {
        int highPalindrome = input + 1;
        while (!isPalindrome(highPalindrome)) {
            highPalindrome += 1;
        }

        int lowPalindrome = input - 1;
        while (!isPalindrome(lowPalindrome)) {
            lowPalindrome -= 1;
        }

        if (input - lowPalindrome > highPalindrome - input) {
            return  highPalindrome;
        } else if (input - lowPalindrome < highPalindrome - input) {
            return lowPalindrome;
        } else {
            System.out.println("Nearest palindromes are: " + highPalindrome + " and " + lowPalindrome);
            return lowPalindrome;
        }
    }
}
