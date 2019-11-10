package encryptdecrypt.crypt;

public class ShiftCrypt implements Crypt {
    private final int key;

    public ShiftCrypt(int key) {
        this.key = key;
    }

    @Override
    public String encode(String message) {
        return CryptUtils.transform(message, c -> encodeWithKey((char) c, key));
    }

    @Override
    public String decode(String message) {
        return CryptUtils.transform(message, c -> encodeWithKey((char) c, -key));
    }

    private int encodeWithKey(final char c, final int s) {
        var res = encodeWithKey(c, s, 'a', 'z');
        if (res == c) {
            res = encodeWithKey(c, s, 'A', 'Z');
        }
        return res;
    }

    private int encodeWithKey(final char c, final int s, char lowSymbol, char highSymbol) {
        final var alphaSize = highSymbol - lowSymbol + 1;
        var shift = s % alphaSize;
        shift = shift > 0 ? shift : alphaSize + shift;
        if (c >= lowSymbol && c <= highSymbol) {

            int res = c + shift;
            if (res > highSymbol) {
                return (char) res - highSymbol + lowSymbol - 1;
            }
            return res;
        }
        return c;
    }
}
