package checkLog;

import java.io.*;

public class LogService {

    public static void main(String[] args) throws IOException {


        File file = new File("src/CheckLog", "Log.txt");

        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            String text;
            System.out.println("Enter text to write in file. 'q' to exit");
            while (!(text = br.readLine()).equals("q")) {

                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
