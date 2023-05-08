package checkLog;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;


public class Logger {
    static java.util.logging.Logger LOGGER;

    static {
        try (FileInputStream ins = new FileInputStream("src/CheckLog/log.config")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = java.util.logging.Logger.getLogger(Logger.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public void Logging() {

        try {
            LOGGER.log(Level.INFO, "Create List");
            List<Integer> ints = new ArrayList<Integer>();
            LOGGER.log(Level.INFO, "Integer type");
            List empty = ints;
            LOGGER.log(Level.INFO, "Assign List");
            List<String> string = empty;
            LOGGER.log(Level.WARNING, "Line1 added");
            string.add("New line1");
            LOGGER.log(Level.WARNING, "Line2 added");
            string.add("New line2");
            LOGGER.log(Level.WARNING, "Line3 added");
            string.add("New line3");

            LOGGER.log(Level.INFO, "Print all elements");
            for (Object anInt : ints) {
                System.out.println(anInt);
            }

            LOGGER.log(Level.INFO, "Size: " + ints.size());
            LOGGER.log(Level.INFO, "First element");
            Integer integer = ints.get(0);
            LOGGER.log(Level.INFO, "Print element");
            System.out.println(integer);

        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Something is wrong", e);
        }
    }

    public void addInfo(final String path, final String value) {
        try {

            final Path p = Paths.get(path);

            if (!Files.exists(p)) {
                throw new IllegalStateException();
            }
            for (int i = 0; i < 6; i++) {
                Files.write(p, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
                Files.write(p, value.getBytes(), StandardOpenOption.APPEND);
            }

            System.out.println("added " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


