public class TrappingRainWater {
//    Trapping Rain Water
//Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute
// how much water can be trapped between the blocks during the rainy season.

    public static void main(String[] args) {
        int[] arr = {7,4,0,9};
        TrappingRainWater.trappingWater(arr,arr.length);
    }

    static long trappingWater(int arr[], int n) {
        // Your code here
//        System.out.println(arr[0] - arr[1]);
        long tapped = 0L;

        for (int a:arr){
            if (!(a == arr[(arr.length - 1)])){
//                System.out.println();
                long current_tap = (arr[0] - a);
                tapped += current_tap;
            }
        }

        System.out.println(tapped);

        return tapped;
    }
}
