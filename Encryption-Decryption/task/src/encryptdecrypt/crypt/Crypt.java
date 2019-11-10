package encryptdecrypt.crypt;

public interface Crypt {
    String encode(String message);
    String decode(String message);
}
