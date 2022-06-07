import java.util.*;

public class ClassPhotos {
    public static boolean classPhotos(List<Integer> blueShirtHeights, List<Integer> redShirtHeights) {
        int blueRow = 0;
        int redRow = 0;
        Collections.sort(blueShirtHeights);
        Collections.sort(redShirtHeights);

        for (int i = 0; i < blueShirtHeights.size(); i++) {
            if (blueShirtHeights.get(i) > redShirtHeights.get(i)) {
                blueRow++;
            }
            else {
                redRow++;
            }
        }
        if (blueShirtHeights.size() == blueRow || redShirtHeights.size() == redRow) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ClassPhotos.classPhotos(Arrays.asList(5, 8, 1, 2, 4), Arrays.asList(6, 9, 2, 4, 5)));
    }
}


