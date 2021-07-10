import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newIntList = new ArrayList<>();

        for (Integer element : intList) {
            if (element > 0 && element % 2 == 0) {
                newIntList.add(element);
            }
        }

        Collections.sort(newIntList);
        for (Integer value : newIntList) {
            System.out.println(value);
        }
    }
}
