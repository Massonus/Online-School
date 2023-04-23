package CheckLog;

import java.io.File;
import java.io.IOException;

public class LogUtils {
    public static void main(String[] args) throws IOException {

        File file = new File("src/CheckLog", "Log.txt");
        file.createNewFile();
        File catalog = new File(file.getParent());
        String[] allFiles = catalog.list();
        for (String s : allFiles) {
            System.out.println(s);
        }
        File[] listRoots = File.listRoots();
        for (File listRoot : listRoots) {
            System.out.print(listRoot + " ");
        }

    }
}
