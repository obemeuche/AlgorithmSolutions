import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {

        int[] arr = {9,51,4,22,0,39,1};

        int[] sortedArray = quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted: " + Arrays.toString(sortedArray));
    }

    private static int[] quickSort(int[] arr, int low, int high)
    {
        //its time complexity is 0(nlogn)
        //it uses a divide and conquer approach
        //it works with recursion and uses a pivot

        if (low < high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
