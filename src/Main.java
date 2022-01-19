import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        try {
            app.runApp("files/new_image");
            //app.runApp("files/abstract");
            //app.runApp("files/still_nature");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Couldn't create a file under selected localization");
        }
    }
}
