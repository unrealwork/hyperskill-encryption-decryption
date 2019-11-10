package encryptdecrypt;

public class ConfigurationUtils {
    private ConfigurationUtils () {

    }

    public static Configuration parseFromArgs(final String[] args) throws ConfigurationParsingException {
        try {
            var conf = new Configuration();
            for (var i = 0; i<args.length; i+=2) {
                var value = args[i+1];
                switch (args[i]) {
                    case "-mode": {
                        conf.setMode(value);
                        break;
                    }
                    case "-in": {
                        conf.setInPath(value);
                        break;
                    }
                    case "-out": {
                        conf.setOutPath(value);
                        break;
                    }
                    case "-data": {
                        conf.setData(value);
                        break;
                    }
                    case "-alg": {
                        conf.setAlgorithm(value);
                        break;
                    }
                    case "-key": {
                        conf.setKey(Integer.parseInt(value));
                        break;
                    }
                }
            }
            return conf;
        } catch (Exception e) {
            throw new ConfigurationParsingException(e);
        }

    }
}
