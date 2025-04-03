package Code;

public class BoatMovements {
    public static boolean canTravelTo(boolean[][] gameMatrix, int fromRow, int fromColumn, int toRow, int toColumn) {
        int numRows = gameMatrix.length;
        int numCols = gameMatrix[0].length;

        // Check if both start and destination are within bounds and on water
        if (!isValid(gameMatrix, fromRow, fromColumn) || !isValid(gameMatrix, toRow, toColumn)) {
            return false;
        }

        // If the start and end points are the same, no movement is needed
        if (fromRow == toRow && fromColumn == toColumn) {
            return true;
        }

        // Ensure movement is either horizontal or vertical
        if (fromRow == toRow) {
            // Moving horizontally (left or right)
            int step = (toColumn > fromColumn) ? 1 : -1;
            for (int col = fromColumn + step; col != toColumn + step; col += step) {
                if (!gameMatrix[fromRow][col]) return false; // Encountered land
            }
            return true;
        } 
        else if (fromColumn == toColumn) {
            // Moving vertically (up or down)
            int step = (toRow > fromRow) ? 1 : -1;
            for (int row = fromRow + step; row != toRow + step; row += step) {
                if (!gameMatrix[row][fromColumn]) return false; // Encountered land
            }
            return true;
        }

        // If movement is diagonal or not strictly horizontal/vertical, it's invalid
        return false;
    }

    // Helper function to check if the coordinate is valid and is water
    private static boolean isValid(boolean[][] gameMatrix, int row, int col) {
        int numRows = gameMatrix.length;
        int numCols = gameMatrix[0].length;

        return row >= 0 && row < numRows && col >= 0 && col < numCols && gameMatrix[row][col];
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

