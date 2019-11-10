package encryptdecrypt.crypt;

class CryptFactoryImpl implements CryptFactory {
    private final int key;

    CryptFactoryImpl(int key) {
        this.key = key;
    }

    @Override
    public Crypt createCrypt(final String type) {
        switch (type) {
            case "unicode":
                return new UnicodeCrypt(key);
            case "shift":
                return new ShiftCrypt(key);
            default:
                return new ShiftCrypt(key);
        }
    }
}
