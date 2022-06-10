import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfProducts {
    //Task
    public static List<Integer> arrayOfProducts (List<Integer> arr) {
        int product = 1;
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    continue;
                }
                product *= arr.get(j);
            }
            newArr.add(product);
        }
        return newArr;
    }


    public static void main(String[] args) {
        System.out.println(ArrayOfProducts.arrayOfProducts(Arrays.asList(1,5,2,4)));
    }
}

