package encryptdecrypt;

import encryptdecrypt.crypt.CoderFactory;
import encryptdecrypt.crypt.CryptFactory;

public class Main {
    public static void main(String[] args) {
        try {
            var conf = ConfigurationUtils.parseFromArgs(args);
            var reader = new ContentReader(conf);
            var content = reader.read();
            var cryptFactory = CryptFactory.getDefault(conf.getKey());
            var crypt = cryptFactory.createCrypt(conf.getAlgorithm());
            var coder = CoderFactory.of(crypt).withMode(conf.getMode());
            var cryptedContent = coder.code(content);
            var writer = new ContentWriter(conf);
            writer.write(cryptedContent);
        } catch (Exception e) {
            System.out.printf("Error : %s%n", e);
        }

    }
}
