import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;
/**
 * KeyboardRow
 */
public class KeyboardRow {

    public KeyboardRow () {
        
    }

    public String[] findWords(String[] words) {
        //return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                map.put(c, i);
            }
        }
        List<String> res = new LinkedList<>();
        for (String w : words) {
            if (w.equals("")) {
                continue;
            } 
            int index = map.get(w.toUpperCase().charAt(0));
            for (char c : w.toUpperCase().toCharArray()) {
                if(map.get(c) != index){
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                res.add(w);
            }
        }
        return res.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] word = new String[]{"Hello","Alaska","Dad","Peace","","WWWWWWWWWWWWWWW"};
        String[] results = new String[word.length];
        KeyboardRow K = new KeyboardRow();
        results = K.findWords(word);
        System.out.println(Arrays.toString(results));
    }
}