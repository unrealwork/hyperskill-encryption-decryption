package encryptdecrypt.crypt;

public class CoderFactory {
    private final Crypt crypt;

    CoderFactory(Crypt crypt) {
        this.crypt = crypt;
    }

    public static CoderFactory of(final Crypt crypt) {
        return new CoderFactory(crypt);
    }


    public Coder withMode(final String mode) {
        if ("dec".equals(mode)) {
            return crypt::decode;
        } else {
            return crypt::encode;
        }
    }
}
