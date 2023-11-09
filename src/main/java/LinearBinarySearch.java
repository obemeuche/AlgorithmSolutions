public class LinearBinarySearch {
    public static void main(String[] args) {
//        int[] num = new int[1000];
        int[] num = {1,3,5,7,9,11,13,15};
        int target = 13;
        int start = 0;
        int end = num.length -1;

        int result1 = linearSearch(num, target);
        int result2 = binarySearch(num, target, start, end);
        int result3 = recursiveBinarySearch(num, target, start, end);
        if(result3 != -1)
            System.out.println("Found target at: " + result3);
        else System.out.println("Target not found!");


    }

    private static int recursiveBinarySearch(int[] num, int target, int start, int end) {

        int steps = 0;
        if (start <= end){
            steps++;
            int mid = (start + end) / 2;
            if (num[mid] == target) {
                System.out.println("Total Steps For Recursive-Binary Search: " + steps);
                return mid;
            } else if (num[mid] < target){
                start = mid + 1;
                return recursiveBinarySearch(num, target, start, end);
            }else {
                end = mid - 1;
                return recursiveBinarySearch(num, target, start, end);
            }
        }

        System.out.println("Total Steps For Recursive-Binary Search: " + steps);
        return -1;
    }

    private static int binarySearch(int[] num, int target, int start, int end) {

        int steps = 0;

        while (start <= end){
            steps++;
            int mid = (start + end) / 2;
            if (num[mid] == target) {
                System.out.println("Total Steps For Binary Search: " + steps);
                return mid;
            }
            else if (num[mid] < target) start = mid + 1;
            else end = mid -1;
        }
        System.out.println("Total Steps For Binary Search: " + steps);
        return -1;
    }

    private static int linearSearch(int[] num, int target) {
        int steps = 0;

        for (int i = 0; i <= num.length-1; i++){
            steps++;
            if(num[i] == target){
                System.out.println("Total Steps For Linear Search: " + steps);
                return i;
            }
        }
        System.out.println("Total Steps For Linear Search: " + steps);
        return -1;
    }
}
