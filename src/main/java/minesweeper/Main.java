package minesweeper;

import java.util.Random;
import java.util.Scanner;

import minesweeper.logger.PrintHiddenField;
import minesweeper.logger.PrintField;
import minesweeper.logger.PrintOpenField;

public class Main {
	static Random r = new Random();
	static Scanner s = new Scanner(System.in);
	static boolean running = true;
	static Player player = new Player();
	static int counter = 0;
	final static int SIZE = 5;
	final static int MINES = 5;
	static Field[][] field = new Field[SIZE][SIZE];

	public static void main(String[] args) {
		generateField();

		while (running) {
			drawField();
			checkInput();
		}
		s.close();
	}

	public static void checkInput() {
		int playerX = player.getX();
		int playerY = player.getY();
		// Field oldField = field[playerX][playerY];
		String input = s.nextLine();
		if ("N".equals(input)) {
			if (--playerY >= 0) {
				player.setY(playerY);
				checkField();
				field[playerX][playerY] = player;
				field[playerX][playerY + 1] = new EmptyField();
			}
		} else if ("E".equals(input)) {
			if (++playerX < SIZE) {
				player.setX(playerX);
				checkField();
				field[playerX][playerY] = player;
				field[playerX - 1][playerY] = new EmptyField();
			}
		} else if ("S".equals(input)) {
			if (++playerY < SIZE) {
				player.setY(playerY);
				checkField();
				field[playerX][playerY] = player;
				field[playerX][playerY - 1] = new EmptyField();
			}
		} else if ("W".equals(input)) {
			if (--playerX >= 0) {
				player.setX(playerX);
				checkField();
				field[playerX][playerY] = player;
				field[playerX + 1][playerY] = new EmptyField();
			}
		}
	}

	// check if field is mine, nomine or goal
	public static void checkField() {
		int playerX = player.getX();
		int playerY = player.getY();
		field[playerX][playerY].setVisited(true);
		if (field[playerX][playerY] instanceof Mine) {
			Mine mine = (Mine) field[playerX][playerY];
			mine.check(player);
			if (!player.isAlive()) {
				System.out.println("KILLED");
				running = player.isAlive();
			}
		} else if (field[playerX][playerY] instanceof NoMine) {
			NoMine nomine = (NoMine) field[playerX][playerY];
			nomine.check(player);
		} else if (field[playerX][playerY] instanceof Goal) {
			Goal goal = (Goal) field[playerX][playerY];
			goal.check(player);
			running = !player.hasWon();
		} if (field[playerX][playerY] instanceof EmptyField) {
			EmptyField empty = (EmptyField) field[playerX][playerY];
			empty.check(player);
		}

	}

	// print hidden field
	public static void drawField() {
		PrintField logger = new PrintHiddenField();
		logger.drawField(SIZE, player, field);
	}

	public static void generateField() {
		// set Mines
		for (int i = 0; i < MINES; i++) {
			field[r.nextInt(SIZE)][r.nextInt(SIZE)] = new Mine();
		}

		// set Goal
		for (int i = 0; i < 1; i++) {
			int x = r.nextInt(SIZE);
			int y = r.nextInt(SIZE);
			if (field[y][x] instanceof Mine) {
				i = 0;
			} else {
				field[y][x] = new Goal();
			}
		}

		// set NoMines
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (!(field[j][i] instanceof Mine || field[j][i] instanceof Goal || field[j][i] instanceof Player)) {
					field[j][i] = new NoMine();
				}
			}
		}

		// set Player
		boolean notFound = true;
		while (notFound) {
			int x = r.nextInt(SIZE);
			int y = r.nextInt(SIZE);
			System.out.print(x + " " + y);
			if (field[x][y] instanceof NoMine) {
				field[x][y] = player; // needed to implement interface. Bad?
				player.setX(x);
				player.setY(y);
				notFound = false;
			}
		}
	}

}
