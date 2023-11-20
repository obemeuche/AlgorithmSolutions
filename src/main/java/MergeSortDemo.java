import java.util.Arrays;

public class MergeSortDemo {

    private static int[] mergeSort(int[] arr, int l, int r)
    {
        //left is the starting index, right is the ending index.
        if(l < r)
        {
            //finding the middle index
            int m = (l + r) / 2;
            //implementing recursion
            mergeSort(arr, l, m);
            //implementing recursion
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }

    private static void merge(int[] arr, int l, int m, int r)
    {
        //getting the length of the 2 (divided) arrays.
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // copying elements in the fist array
        System.arraycopy(arr, l + 0, leftArray, 0, n1);
//        for (int y =0; y < n1; y++)
//        {
//            leftArray[y] = arr[l+y];
//        }
        System.out.println("LeftArray: " + Arrays.toString(leftArray));

        // copying elements in the second array
        for (int y =0; y < n2; y++)
        {
            rightArray[y] = arr[m+1+y];
        }
        System.out.println("rightArray: " + Arrays.toString(rightArray));

        int i = 0;
        int j = 0;
        int k = l;

        // merging both arrays
        while(i<n1 && j<n2)
        {
            if(leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i<n1)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1111,17,2,94,5,8,49};

        int[] sortedArray = mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
