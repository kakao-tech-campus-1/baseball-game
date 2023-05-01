import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

    public static Map<String, Integer> compare(List<Integer> users, List<Integer> answer) {
        int bulls = 0;
        int cows = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            if (users.get(i) == answer.get(i)){
                bulls += 1;
            }else{
                if (answer.contains(users.get(i))) {
                    cows += 1;
                }
            }
        }

        map.put("bulls",bulls);
        map.put("cows",cows);

        return map;
    }
}