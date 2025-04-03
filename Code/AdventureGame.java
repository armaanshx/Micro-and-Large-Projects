package Code;

import java.util.*;

public class AdventureGame {
    public static int usageCount(List<Integer> bridge) {
        int count = 0;

        while (true) {
            // Step 1: Reduce each section by 1
            for (int i = 0; i < bridge.size(); i++) {
                bridge.set(i, bridge.get(i) - 1);
            }

            // Step 2: Check if any section has collapsed (≤ 0)
            for (int section : bridge) {
                if (section <= 0) {
                    return count;
                }
            }

            // Step 3: Increment usage count if bridge is still intact
            count++;
        }
    }

    public static void main(String[] args) {
        List<Integer> bridge = Arrays.asList(7, 6, 5, 8);
        System.out.println(usageCount(new ArrayList<>(bridge))); // Should print 2
    }
}


