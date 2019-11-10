package encryptdecrypt;

import java.io.FileWriter;
import java.io.IOException;

public class ContentWriter {
    private final Configuration configuration;

    public ContentWriter(Configuration configuration) {
        this.configuration = configuration;
    }

    void write(final String content) throws ContentWritingException {
        if (configuration.getOutPath() != null) {
            try (var writer = new FileWriter(configuration.getOutPath())) {
                writer.write(content);
            } catch (IOException e) {
                throw new ContentWritingException(e);
            }
        } else {
            System.out.println(content);
        }
    }
}
