package Code;

public class BoatMovements {
    public static boolean canTravelTo(boolean[][] gameMatrix, int fromRow, int fromColumn, int toRow, int toColumn) {
        int rows = gameMatrix.length;
        int cols = gameMatrix[0].length;

        // Check if the target position is out of bounds
        if (toRow < 0 || toRow >= rows || toColumn < 0 || toColumn >= cols) {
            return false;
        }

        // The boat can only move up, down, left, or right in a straight line through water
        if (fromRow == toRow) {
            // Moving horizontally
            int start = Math.min(fromColumn, toColumn);
            int end = Math.max(fromColumn, toColumn);
            for (int c = start; c <= end; c++) {
                if (!gameMatrix[fromRow][c]) {
                    return false; // Land encountered, can't travel
                }
            }
            return true;
        } else if (fromColumn == toColumn) {
            // Moving vertically
            int start = Math.min(fromRow, toRow);
            int end = Math.max(fromRow, toRow);
            for (int r = start; r <= end; r++) {
                if (!gameMatrix[r][fromColumn]) {
                    return false; // Land encountered, can't travel
                }
            }
            return true;
        }

        // If not in the same row or column, movement is not allowed
        return false;
    }

    public static void main(String[] args) {
        boolean[][] gameMatrix = {
            {false, true,  true,  false, false, false},
            {true,  true,  true,  false, false, false},
            {true,  true,  true,  true,  true,  true},
            {false, true,  true,  false, true,  true},
            {false, true,  true,  true,  false, true},
            {false, false, false, false, false, false},
        };

        System.out.println(canTravelTo(gameMatrix, 3, 2, 2, 2)); // true, Valid move
        System.out.println(canTravelTo(gameMatrix, 3, 2, 3, 4)); // false, Can't travel through land
        System.out.println(canTravelTo(gameMatrix, 3, 2, 6, 2)); // false, Out of bounds
}
}
