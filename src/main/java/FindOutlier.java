import java.util.ArrayList;

public class FindOutlier {
//    You are given an array (which will have a length of at least 3, but could be very large)
//
//    containing integers. The array is either entirely comprised of odd integers or entirely comprised of
//
//    even integers except for a single integer N. Write a method that takes the array as an argument and returns
//
//    this "outlier" N.
//
//                      Examples
//            [2, 4, 0, 100, 4, 11, 2602, 36]
//    Should return: 11 (the only odd number)
//
//            [160, 3, 1719, 19, 11, 13, -21]
//    Should return: 160 (the only even number)

    public static int findPOutlier(ArrayList<Integer> integers) {
        ArrayList<Integer> oddN = new ArrayList<>();
        ArrayList<Integer> evenN = new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            if(integers.get(i) % 2 == 0) {
                evenN.add(integers.get(i));
            }
            else oddN.add(integers.get(i));
        }

        if (evenN.size() > oddN.size()) {
            return oddN.get(0);
        }
        else  return evenN.get(0);
    }
}
