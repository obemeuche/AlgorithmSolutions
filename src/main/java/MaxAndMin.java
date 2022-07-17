public class MaxAndMin {
    static int maxAndMin(int [] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        return max + min;
    }

    //OR

    static int minAndMax(int [] arr){
        int min = Integer.MAX_VALUE; // min = 216761768
        int max = Integer.MIN_VALUE;  // max = -216761768
        for (int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return max + min;
    }
}
