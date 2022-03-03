package nick.pack;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.ru/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        URLConnection connect = url.openConnection();
        InputStream input = connect.getInputStream();

        Path path = Path.of("C:\\Users\\Андрей\\Pictures\\img\\googlelogo_color_272x92dp.png");
        Files.copy(input, path);
    }
}


