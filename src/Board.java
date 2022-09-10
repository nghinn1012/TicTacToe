public class Board {
    public String[][] board;
	public static final int ROWS = 3;
	public static final int COLUMNS = 3;
	public String regex = "\\s{3}";
	
	public Board() {
		board = new String[ROWS][COLUMNS];
		this.initializeBoard();
	}
	
	// tạo bảng với toàn ô trống
	public void initializeBoard() {
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j++) {
				board[i][j] = "   ";
			}
		}
	}
	
}
