package Code;

import java.util.Arrays;
import java.util.List;

public class DigitalFlasks {
    public static int getCount(List<Integer> flaskSizes, int waterAvailable, int tankVolume) {
        // Edge case: If the tank volume is 0, no draws are required.
        if (tankVolume == 0) return 0;

        // Edge case: If available water is less than the required tank volume, return -1.
        if (waterAvailable < tankVolume) return -1;

        // Create an array to store the minimum number of draws required for each volume up to tankVolume.
        int[] dp = new int[tankVolume + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Process each flask size
        for (int flask : flaskSizes) {
            for (int v = flask; v <= tankVolume; v++) {
                if (dp[v - flask] != Integer.MAX_VALUE) {
                    dp[v] = Math.min(dp[v], dp[v - flask] + 1);
                }
            }
        }

        // If the tankVolume cannot be achieved, return -1.
        return (dp[tankVolume] == Integer.MAX_VALUE) ? -1 : dp[tankVolume]-1;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 3, 7, 1, 5, 4);
        System.out.println(getCount(input, 100, 34));  // Expected output: 5
    }
}
