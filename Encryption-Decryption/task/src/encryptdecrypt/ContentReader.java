package encryptdecrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class ContentReader {
    private final Configuration configuration;

    public ContentReader(Configuration conf) {
        this.configuration = conf;
    }

    public String read() throws ContentReadingException {
        if (configuration.getData() != null) {
            return configuration.getData();
        }
        if (configuration.getInPath() != null) {
            try (var reader = new BufferedReader(new FileReader(configuration.getInPath()))) {
                return reader.lines().collect(Collectors.joining(String.format("%n")));
            } catch (IOException e) {
                throw new ContentReadingException(e);
            }
        }
        return "";
    }
}
