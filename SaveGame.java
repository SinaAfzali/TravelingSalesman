package classes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGame {
    public SaveGame(String filename, int[]arr) throws IOException {
        BufferedWriter ow = null;
        ow = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < arr.length; i++) {
            ow.write(arr[i]+"");
            ow.newLine();
        }
        ow.flush();
        ow.close();
    }
}
