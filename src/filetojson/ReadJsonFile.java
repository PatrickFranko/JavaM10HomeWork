package filetojson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class ReadJsonFile {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        FileReader fr = new FileReader("user.json");
        Type userListType = new TypeToken<List<User>>(){}.getType();
        List<User> users = gson.fromJson(fr, userListType);
        for(User u : users){
            System.out.println(u);
        }
        fr.close();
//        JsonElement user = new JsonParser().parse("user.json");
//        System.out.println(user);
    }
}
