import java.util.HashSet;

public class PossibleCandyFlavour {
//    Mary has lots of Candies represents by an array of Integer which represents various flavours.
//
//    Mary wants to share the candies equally with his younger brother, but Mary wants to have every possible flavour of candy she can have.
//
//    Write a function to help Mary know how many possible flavours she can have.
//
//    E.g 1. Array of Flavour {2,3,6,3,6,3,3,3} where 2,3,6 represents different flavours of candy Mary has initially.
//
//    Your function should return 3 as Mary can have flavours 2,3,6 and either flavour 3 or 6 after sharing.
//
//    E.g 2. Array of Flavour {1,2,2,3} where 1,2,3 represents different flavours of candy Mary has initially.
//
//    Your function should return 2 as Mary can have either {1,2} or she can have {2,3} or {1,3} after sharing.
//
//    E.g 3. Array of Flavour {5,5,5,5,5,5} where 5 represents a flavour of candy Mary has initially.
//
//    Your function should return 1 as Mary can only  have flavour 5 after sharing.
//
//    NB:     1.    Array can be up to 10,000 in size.
//
//            2.    The array of Candy flavours is an even length array, so that Mary can share equally



    public static int getPossibleCandyFlavour(int [] arr){
        // Write your function here
        HashSet set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if (set.size() < arr.length/2 || set.size() == arr.length/2) return set.size();
        else if (set.size() == 1) return 1;
        else return arr.length/2;
    }

}
