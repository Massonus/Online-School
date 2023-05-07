package checkIp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Service {

    public static List<String> getText(final String path) {
        try {
            final Path p = Paths.get(path);
            final List<String> strings = Files.readAllLines(p);
            return strings;
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException();
    }


}
