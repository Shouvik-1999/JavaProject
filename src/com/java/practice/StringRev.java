package com.java.practice;

public class StringRev {
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        StringRev obj = new StringRev();
        String str = "Hello, World!";
        String reversedStr = obj.reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
