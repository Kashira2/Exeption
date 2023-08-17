import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException{
        PasswordVerifier passwordVerifier = new PasswordVerifier();

        try {
            passwordVerifier.verifyPassword("123asasdASS");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        FileManager fileManager = new FileManager();
        fileManager.read("file321.txt");
        fileManager.copy("file.txt", "file2.txt");

    }
}
