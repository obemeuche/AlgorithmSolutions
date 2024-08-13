public class MaxAndMin {
    static int maxAndMin(int [] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        return max + min;
    }

    //OR

    static int minAndMax(int [] arr){
        int min = Integer.MAX_VALUE; // min = 216761768
        int max = Integer.MIN_VALUE;  // max = -216761768
        for (int j : arr) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        return max + min;
    }

    public static void main(String[] args) {
                int[] arr = {3,5,2,5,6};
        System.out.println(maxAndMin(arr));
        System.out.println(minAndMax(arr));
    }
}
