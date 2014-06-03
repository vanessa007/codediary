
public class CheckRandomTicTacToeBoard {
	public static void main(String[] args) {
		
		System.out.println("Generate a TicTacToe board randomly: \n");
		
		int[][] board = new int[3][3];
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = (int)(Math.random() * 2);
				System.out.print(board[i][j]);
				count ++;
				if (count % 3 == 0) {
					System.out.println();
					}
				}		
			}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				System.out.println("All " + board[i][1] + "s on row " + i);
			}
		}
		
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				System.out.println("All " + board[0][j] + "s on column " + j);
			}
		}
		
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] || 
				board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
				System.out.println("All " + board[1][1] + "s on diagonal");
		}
	}
}
