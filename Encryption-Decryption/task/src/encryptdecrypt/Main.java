package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s = sc.nextLine();
        var key = sc.nextInt();
        System.out.println(encrypt(s, key));
    }

    private static String encrypt(final String message, final int key) {
        return message.chars()
                .map(c -> encryptWithKey(c, key))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    private static Character encryptWithKey(final int c, final int key) {
        if (c >= 'a' && c <= 'z') {
            return (char) ('a' + (c - 'a' + key%26)%26);
        }
        return (char)c;
    }
}
