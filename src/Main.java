import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Game test = new Game();
		String player = "X";
		do {
			System.out.println(test.printBoard());
			if (player == "X")
				System.out.println("X turn");
			else
				System.out.println("O turn");
			int row = input.nextInt();
			if (row == -1)
				break;
			int column = input.nextInt();
			test.setPlay(row - 1, column - 1, player);
			if (test.isGameOver() || test.isFull()) {
				if (test.isFull()
				)
					System.out.println("Drawn!");
				else
					System.out.println(test.printBoard() + "\n" + player + " wins!");
				break;
			}
			if (player == "X") {
				player = "O";
			} else {
				player = "X";
			}
		} while (true);
		System.out.println("END!");
		input.close();
	}

}