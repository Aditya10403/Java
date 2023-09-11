import java.util.Arrays;
import java.util.Scanner;

// Ceiling and Floor of Number.
public class Ceiling_FloorofNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.println("Ceiling and Floor number program -");
        System.out.println("Your Array - " + Arrays.toString(arr));
        System.out.print("Enter a target to search in the above array - ");
        int target = in.nextInt();
        System.out.println("The Ceiling number for the target is = " + CeilingNum(arr, target));
        System.out.println("The Floor number for the target is = " + FloorNum(arr,target));
        System.out.println("..End of Program..");
    }

    // Find the smallest number >= target
    static int CeilingNum(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (target > arr[arr.length - 1]) return -1;
            if (target == arr[middle]) return arr[middle];
            if (target < arr[middle]){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return arr[start]; // answer will be at middle + 1
    }
    // Find the greatest number <= target
    static int FloorNum(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) return arr[middle];
            if (target < arr[middle]){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return arr[end]; // answer will be at middle - 1
    }
}
