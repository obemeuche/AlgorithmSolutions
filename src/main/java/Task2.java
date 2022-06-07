import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
//    Task
//    Given an array of 2k integers (for some integer k, which will be betwen 0 and 5 inclusive),
//    perform the following operations until the array contains only one element:
//
//    On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
//    On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
//    After the algorithm has finished, there will be a single element left in the array. Return that element.
//
//            Specification
//      Challenge.PackArray(arr)
//    Parameters
//    arr: int[] - An array of integers to be packed
//
//    Return Value
//    int - The final product
//
//            Constraints
//    arr.length == 2k
//
//0 ≤ k ≤ 5
//
//            -9 ≤ arr[i] ≤ 99
//
//    Example
//    For arr = [1, 2, 3, 4, 5, 6, 7, 8], the output should be 186.
//
//    We have [1, 2, 3, 4, 5, 6, 7, 8] -> [3, 7, 11, 15] -> [21, 165] -> [186], so the answer is 186.
//    public static int arrayPacking (ArrayList<Integer> integers) {
//        int iteration = 0;
//
//        ArrayList<Integer> newArr = new ArrayList<>();
//
//
//        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList());
//
////        while (newArr.size() > 1) {
////            iteration++;
////        ArrayList<Integer> n = new ArrayList();
//        for (
//            if(iteration % 2 == 0) {
//                for (int i = 0; i < n.size()-1; i++) {
//                    n.add(arr[i] * arr[i+1]);
//                    i+=1;
//                }
//            }
//            else {
//                for (int i = 0; i < arr.length-1; i++) {
//                    newArr.add(arr[i] + arr[i+1]);
//                    i+=1;
//                }
//            }
//        }
//        return newArr.get(0);
//    }
//
//    public static void main(String[] args) {
//        integers = {1,2,3,4,5,6,7,8};
//        Task2.arrayPacking(arr);
//    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7};

        for (int i =0; i < 6; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

}





//    public static int arraypacking(int[] c){
//        ArrayList<Integer> n = new ArrayList<>();
//        for (int i : c) n.add(i);
//        int count = 1;
//        while (n.size() > 1){
//            n = packer(n,count);
//            count++;
//        }
//        return n.get(0);
//    }
//    public static ArrayList<Integer> packer(ArrayList<Integer> integers, int count){
//        ArrayList<Integer> compiler = new ArrayList<>();
//        if (count % 2 == 0){
//            for (int i = 0; i < integers.size(); i += 2) compiler.add(integers.get(i) * integers.get(i + 1));
//            return compiler;
//        }else{
//            for (int i = 0; i < integers.size(); i += 2) compiler.add(integers.get(i) + integers.get(i + 1));
//            return compiler;
//        }
//    }
