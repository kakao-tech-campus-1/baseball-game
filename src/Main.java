import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public Boolean duplicateBalls(List<Integer> baseballs){
        Set<Integer> numSet = new HashSet<>(baseballs);

        if(numSet.size() != baseballs.size()){
            return false;
        }
        return true;
    }

}