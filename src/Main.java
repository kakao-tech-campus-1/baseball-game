import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer>users = List.of(1,2,3,4);
        List<Integer>answers=List.of(2,4,5,6);

        Map<String, Integer> compare = compare(users, answers);
        System.out.println(compare.toString());
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