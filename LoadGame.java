package classes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LoadGame {

  public LoadGame(String fileName,int dataArray[]){

      String line = null;
      int lineNumber = 0;

      try {
          FileReader fileReader = new FileReader(fileName);
          BufferedReader bufferedReader = new BufferedReader(fileReader);

          while((line = bufferedReader.readLine()) != null) {
              dataArray[lineNumber] = Integer.parseInt(line);
              lineNumber++;
          }

          bufferedReader.close();
      }
      catch(IOException ex) {
          System.out.println("Error reading file '" + fileName + "'");
          ex.printStackTrace();
      }



  }


}
