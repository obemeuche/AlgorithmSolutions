import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayOfProducts {
    //Task
    public static List<Integer> arrayOfProducts (List<Integer> arr) {
        int product = 1;
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            for (Integer integer : arr) {
                if (Objects.equals(arr.get(i), integer)) {
                    continue;
                }
                product *= integer;
            }
            newArr.add(product);
        }
        return newArr;
    }


    public static void main(String[] args) {
        System.out.println(arrayOfProducts(Arrays.asList(1,5,2,4)));
    }
}

