import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ValidNumberToConsole {
    public static void ReadFile() throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        String content = new String(buffer, StandardCharsets.UTF_8);
        String[] arrayString = content.split("\\r?\\n");
        for (String str : arrayString ){
            //System.out.println(str+"//////");
            if(str.matches("\\d{3}-\\d{3}-\\d{4}")
                    || str.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")){
                System.out.println(str);
            }

        }
        fis.close();

    }

    public static void main(String[] args) throws IOException {
        ReadFile();
    }
}
