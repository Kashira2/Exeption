import java.text.ParseException;

public class Main {
    public static void main(String[] args){
        PasswordVerifier passwordVerifier = new PasswordVerifier();

        try {
            passwordVerifier.verifyPassword("123asasdASS");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
