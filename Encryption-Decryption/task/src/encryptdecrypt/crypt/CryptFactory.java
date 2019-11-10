package encryptdecrypt.crypt;

public interface CryptFactory {
    Crypt createCrypt(final String type);

    public static CryptFactory getDefault(final int key) {
        return new CryptFactoryImpl(key);
    }
}
