package filetojson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileTxtToJson {



    public static void main(String[] args) throws IOException {
        ArrayList<User> users = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter fw = new FileWriter("user.json");
        BufferedReader br = new BufferedReader(new FileReader("file_user.txt"))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                String[] spl = line.split("\\s+");
                User user = new User(spl[0], Integer.parseInt(spl[1]));
                users.add(user);
                line = br.readLine();
            }
            gson.toJson(users, fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
