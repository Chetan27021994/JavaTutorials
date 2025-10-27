import java.util.HashMap;
import java.util.Map;

public class Main{
    public static boolean hasDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {45, 66, 8886, 1};
        int[] arr2 = {11, 25, 37, 11};

        System.out.println("Array 1 has duplicates? " + hasDuplicates(arr1));
        System.out.println("Array 2 has duplicates? " + hasDuplicates(arr2));
    }
}
