package encryptdecrypt.crypt;

import java.util.function.IntUnaryOperator;

class CryptUtils {
    private CryptUtils() {

    }

    static String transform(final String message, final IntUnaryOperator function) {
        return message.chars()
                .map(function)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}
