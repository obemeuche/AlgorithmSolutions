import java.util.ArrayList;
import java.util.Arrays;

public class DirectionReduction {
    /*
We are given directions to go from one point to another. The directions are "NORTH", "SOUTH", "WEST", "EAST".

Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going one direction and coming back the opposite

direction is a wasted effort, so let's concise these directions to go the shortest route. For example, given the following directions:

plan = ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]

You can immediately see that going "NORTH" and then "SOUTH" is not reasonable, better stay to the same place!
So the task is to reduce a simplified version of the plan. A better plan in this case is simply: plan = ["WEST"]

Other examples:

In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away.

What a waste of time! Better to do nothing. The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other,

therefore, the final result is [] (nil in Clojure).

In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly

opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].

Task

You have to write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions

removed (W<->E or S<->N side by side).

The Haskell version takes a list of directions with data Direction = North | East | West | South. The Clojure version returns nil

when the path is reduced to nothing.

Examples

["NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","WEST"] --> ["WEST"]

["NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"] --> []

["NORTH","WEST","SOUTH","EAST"] --> ["NORTH","WEST","SOUTH","EAST"]

Note

Not all paths can be made simpler.

The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST"

are not directly opposite of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
     */

    public static String [] dirReduction(String[] arr){
        // Converting an array to an arraylist
        ArrayList<String> newArr = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < newArr.size() - 1; i++){
            if (newArr.get(i).equals("NORTH") && newArr.get(i+1).equals("SOUTH")){
                newArr.remove("NORTH");
                newArr.remove("SOUTH");
                i = -1;
            }
            else if (newArr.get(i).equals("SOUTH") && newArr.get(i+1).equals("NORTH")) {
                newArr.remove("NORTH");
                newArr.remove("SOUTH");
                i = -1;
            }
            else if (newArr.get(i).equals("EAST") && newArr.get(i+1).equals("WEST")) {
                newArr.remove("EAST");
                newArr.remove("WEST");
                i = -1;
            }
            else if (newArr.get(i).equals("WEST") && newArr.get(i+1).equals("EAST")) {
                newArr.remove("EAST");
                newArr.remove("WEST");
                i = -1;
            }
        }
        String [] dirArr = new String[newArr.size()];
        return newArr.toArray(dirArr);
    }

    public static void main(String[] args) {
        String []arr = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String []arr2 = {"NORTH", "SOUTH", "EAST", "WEST"};
        String []arr3 = {"NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"};
        String []arr4 = {"NORTH", "WEST", "SOUTH", "EAST"};
        System.out.println(Arrays.toString(dirReduction(arr)));
        System.out.println(Arrays.toString(dirReduction(arr2)));
        System.out.println(Arrays.toString(dirReduction(arr3)));
        System.out.println(Arrays.toString(dirReduction(arr4)));
//1. Arrays.toString in the case where u returned an array
//2. List.of() is used to convert an array to a list
//3. List is used to remove at any index or any element bt stack only removes from the top
//4. When accessing element after current position. e.g (i+1) stop the loop at index before the end i.e  i < directionList.size() -1
//5. You can reset ur array by setting i = -1 not i = 0
    }
}
