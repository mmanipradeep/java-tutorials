package com.switchExample;

public class SwitchExample {

    public static void main(String[] args) {
        System.out.println(getTextViaArrow(3));
    }

    private static String getTextViaArrow(int number) {
        String result = switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
        return result;
    }
}
