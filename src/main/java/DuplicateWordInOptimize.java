import java.util.HashMap;
import java.util.Map;

public class DuplicateWordInOptimize {
    public static void main(String[] args) {
        String str="Big black bug bit a big black dog on his big black nose";
        String[] words=str.split(" ");
        System.out.println("------------start print using map--------------");
        Map<String,Integer> stringCount=new HashMap<>();
        for(String word:words){
            if(stringCount.containsKey(word)){
                stringCount.put(word,stringCount.get(word)+1);
            }else{
                stringCount.put(word,1);
            }
        }
        for(String key:stringCount.keySet()){
            if(stringCount.get(key)>1){
                System.out.println(key);
            }
        }
    }
}
