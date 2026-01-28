import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] average (int[] nums){
        int sum = 0;
        for(int num : nums)
            sum += num;
        int size = nums.length;
        int average = sum / size;
        int[] nums2 = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            nums2[i] = nums[i] - average;
        return nums2;
    }
    public static int[] createRandomArray(int n){
        Random rd = new Random();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = rd.nextInt(100);
        }
        return ans;
    }
    public static int[] minmax (int[] a) {
            int[] answer;
                int min = 0;
                int max = 0;
            if(a.length == 0) {
                return null;
            } else {
                
                for(int i = 0; i < a.length; i++) {
                    if(a[i] < min) {
                        min = a[i];
                    }
                    if(a[i] > max) {
                        max = a[i];
                    }
                }
            }
            return new int[]{min, max};
        }

     public static int findTheSum(int[] arr, boolean isOdd){

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if(isOdd){
                    if(i%2 != 0){
                        sum += arr[i];
                    } 
                }
                else{
                    if(i%2 == 0){
                        sum += arr[i];
                    }
                }
            }
            return sum;
        }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option = 0;
        System.out.print("Enter array size:");
        int arrraySize = input.nextInt();
        int[] array = createRandomArray(arrraySize);
        while (option != 4){
            System.out.print("1) Minimum and maximum of the Array \n2) Normalized Array \n3) The sum of elements with odd- and even-numbered indexes \n4) Exit \n Choose funtion: ");
            option = input.nextInt();
            switch (option){
                case 1:
                    int[] minMax = minmax(array);
                    System.out.println("Minimum of array:" + minMax[0] + ", maximum of array:" + minMax[1]);
                    break;
                case 2:
                    int[] averageArray = average(array);
                    System.out.print("Normalized array:");
                    for (int i = 0; i < array.length; i++){
                        System.out.print(averageArray[i]+ " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Sum of odd indexes elements: " + findTheSum(array, true));
                    System.out.println("Sum of even indexes elements: " + findTheSum(array, false));
                case 4:
                    System.out.println("Bye Bye!");
                    break;
            }
        }
    }

}
