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
}
