package findallwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountOfEveryWordInFile {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordsCount = new HashMap<>();
        String line;
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        while((line = br.readLine()) !=null){
            String[] words = line.split("\\s+");
            for(String w : words) {
                if (wordsCount.containsKey(w)){
                    wordsCount.put(w, wordsCount.get(w)+1);
                }else {wordsCount.put(w,1);}
            }
        }
        for(Map.Entry<String, Integer> mapWord : wordsCount.entrySet()){
            System.out.println(mapWord.getKey()+ " " + mapWord.getValue());
        }
    }


}
