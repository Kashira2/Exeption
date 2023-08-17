import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public void read(String filePath) throws FileNotFoundException{
        File file = new File(filePath);

        

        if(!file.exists()){
            throw new FileNotFoundException("File not found");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }


    public void write(String filePath, String content) throws IOException{
        FileWriter fileWriter = new FileWriter(filePath);

        try {
            fileWriter.write(content);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void copy(String sourceFilePath, String destinationFilePath) throws IOException{
        FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFilePath);

        byte[] buffer = new byte[1024];

        int bytesRead;

        try {
            while ((bytesRead = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
