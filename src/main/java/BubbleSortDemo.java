import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,7,0,9,4};

        int size = nums.length;

        int [] sortedNum = bubbleSort(nums, size);

        System.out.println("Sorted Array: " + Arrays.toString(sortedNum));
    }

    private static int[] bubbleSort(int[] nums, int size) {
        // it is a type of sorting algorithm
        // it aims at comparing values and swapping them aka sorting
        // bubble sort has a time complexity of 0(n'2)
        // it is not efficient but simple to understand

        int steps =0;
        int temp = 0;
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size - i - 1; j++){
                steps++;
                if (nums[j] > nums[j+1]){
                    // this is where the swap happens
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("Steps: " + steps);
        return nums;
    }
}
