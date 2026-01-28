import java.util.Random;

public class Main {
    public static int[] createRandomArray(int n){
        Random rd = new Random();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = rd.nextInt(100);
        }
        return ans;
    }
    public int[] minmax (int[] a) {
            int[] answer;
            if(a.length == 0) {
                return null;
            } else {
                int min = 0;
                int max = 0;
                for(int i = 0; i < a.length; i++) {
                    if(a[i] < min) {
                        min = a[i];
                    }
                    if(a[i] > max) {
                        max = a[i];
                    }
                }
            return new int[]{min, max};
            }
        }
}
