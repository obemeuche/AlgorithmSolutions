import java.util.Arrays;

public class MergeSortDemo {

    private static int[] mergeSort(int[] arr, int l, int r)
    {
        if(l < r)
        {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }

        return arr;
    }

    private static void merge(int[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int y =0; y < n1; y++)
        {
            leftArray[y] = arr[l-y];
        }

        for (int y =0; y < n2; y++)
        {
            rightArray[y] = arr[m+1+y];
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,1,7,2,9,5,8,4};

        int[] sortedArray = mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

}
