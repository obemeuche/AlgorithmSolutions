import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int [] arr = {2,4,3,1,6,5,7,0,9};

        int [] sortedArray = insertionSort(arr);

        System.out.println("Inserted Array: " + Arrays.toString(sortedArray));
    }

    private static int[] insertionSort(int[] arr) {
        // this is a type of sorting algorithm
        // its time complexity is 0(n'2)

        int steps = 0;

        for(int i = 1; i < arr.length; i++){
            steps++;
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Steps: " + steps);
        return arr;
    }
}
