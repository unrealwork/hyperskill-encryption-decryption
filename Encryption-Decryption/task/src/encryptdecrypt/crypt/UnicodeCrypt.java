package encryptdecrypt.crypt;

class UnicodeCrypt implements Crypt {

    private final int key;

    UnicodeCrypt(int key) {
        this.key = key;
    }

    @Override
    public String encode(String message) {
        return CryptUtils.transform(message, this::encryptWithKey);
    }

    @Override
    public String decode(String message) {
        return CryptUtils.transform(message, this::decryptWithKey);
    }

    private int encryptWithKey(final int c) {
        return c + key;
    }

    private int decryptWithKey(final int c) {
        return c - key;
    }
}
