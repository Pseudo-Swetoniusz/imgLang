import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        try {
            String file = args[0];
            app.runApp(file);
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Couldn't create a file under selected localization");
        }
    }
}
