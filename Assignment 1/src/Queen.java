import java.util.Arrays;

public class Queen {
	
	private static final int SIZE = 8;

	public static void main(String args[]){
		Queen q = new Queen();
		int slashMatrix[][] = new int[SIZE][SIZE],
			backslashMatrix[][] = new int[SIZE][SIZE];
		
		boolean checkRow[] = new boolean[SIZE],
				checkSlash[] = new boolean[2*SIZE-1],
				checkBackslash[] = new boolean[2*SIZE-1];
		
		String board[][] = new String[SIZE][SIZE];
		
		for(String[] row : board) {
			Arrays.fill(row, " ");
		}
		Arrays.fill(checkRow, false);
		Arrays.fill(checkSlash, false);
		Arrays.fill(checkBackslash, false);
		
		for(int i = 0;i < SIZE;i++) {
			for(int j = 0; j < SIZE; j++) {
				slashMatrix[i][j] = i+j;
				backslashMatrix[i][j] = i-j+(SIZE-1);
			}
		}
	
		//long startTime = System.nanoTime();
		if (!q.solve(board, 0, slashMatrix, backslashMatrix, checkRow, checkSlash, checkBackslash)){
			System.out.print("Solution doesn't exist");
		}
		q.printTable(board);
		/*long endTime   = System.nanoTime();
		long totalTime =  (endTime - startTime);
		System.out.println("It takes "+ totalTime + " nanoseconds to finish.");*/
	}

	private boolean solve(String board[][], 
			int col,
			int[][] slashMatrix,
			int[][] backslashMatrix,
			boolean[] checkRow,
			boolean[] checkSlash,
			boolean[] checkBackslash){
		if (col >= SIZE) {
			return true;
		}
	
		for (int i = 0; i < board[0].length; i++) {
			if (isPossible(i, col, slashMatrix, backslashMatrix, checkRow, checkSlash, checkBackslash)){
				board[i][col] = "Q";
				checkRow[i] = true;
				checkSlash[slashMatrix[i][col]] = true;
				checkBackslash[backslashMatrix[i][col]] = true;
	
				if (solve(board, col + 1, slashMatrix, backslashMatrix, checkRow, checkSlash, checkBackslash)) {
					return true;
				}
	
				board[i][col] = " "; 
				checkRow[i] = false;
				checkSlash[slashMatrix[i][col]] = false;
				checkBackslash[backslashMatrix[i][col]] = false;
			}
		}
		return false;
	}

	private boolean isPossible(int row,
			int col,
			int[][] slashMatrix,
			int[][] backslashMatrix,
			boolean[] checkRow,
			boolean[] checkSlash,
			boolean[] checkBackslash){
		
		return !checkRow[row] &&
				!checkSlash[slashMatrix[row][col]] &&
				!checkBackslash[backslashMatrix[row][col]];
	}

	private void printTable(String board[][]){
		for (int i = 0; i < board[0].length; i++){
			for (int j = 0; j < board[1].length; j++) {
				System.out.print("|" + board[i][j]);
			}
			System.out.print("|\n");
		}
	}
}
