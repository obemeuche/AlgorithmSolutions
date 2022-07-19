import java.util.ArrayList;
import java.util.Collections;

public class SunsetViews {
    public static ArrayList<Integer> sunsetView(int[] buildings, String direction){

        int tallestBuilding = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++){
            if (direction.equals("WEST") && tallestBuilding < buildings[i]){
                arr.add(i);
                tallestBuilding = buildings[i];
                Collections.sort(arr);
            }
        }
        for (int i = buildings.length - 1; i >= 0; i--){
            if (direction.equals("EAST") && tallestBuilding < buildings[i]){
                arr.add(i);
                tallestBuilding = buildings[i];
                Collections.sort(arr);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] building = {3,5,4,4,3,1,3,2};
        String direction = "EAST";
        System.out.println(sunsetView(building,direction));
    }
}
