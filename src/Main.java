import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        try {
            app.runApp("files/still_nature");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
