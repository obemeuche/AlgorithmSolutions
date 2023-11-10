import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,7,0,9,4};

        int size = nums.length;

        int [] sortedNum = selectionSort(nums, size);

        System.out.println("Sorted Array: " + Arrays.toString(sortedNum));
    }

    private static int[] selectionSort(int[] nums, int size) {
        // this is a type of sorting algorithm
        // it is more efficient than the bubble method as it has fewer steps.
        // its time complexity is 0(n'2)


        int steps = 0;
        int temp = 0;
        int minIndex = 0;

        for(int i = 0; i < size - 1; i++)
        {
            steps++;
             minIndex = i;
            for (int j = i + 1; j < size; j++)
            {
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println("Steps: " + steps);
        return nums;
    }
}
