package minesweeper.logger;

import minesweeper.EmptyField;
import minesweeper.Field;
import minesweeper.Goal;
import minesweeper.Player;

public class PrintHiddenField implements PrintField {

	// IDEAS
	// return x and y as array
	// set a sharable variable

	@Override
	public void drawField(int SIZE, Player player, Field[][] field) {
		for (int i = 0; i < SIZE; i++) {
			System.out.println();
			for (int j = 0; j < SIZE; j++) {
				if (!(field[j][i] instanceof Player) && field[j][i].isVisited()) {
					System.out.print(field[j][i].toString() + " | ");
				}
				if (field[j][i] instanceof Player) {
					System.out.print(field[j][i].toString() + " | ");
					player.setX(j);
					player.setY(i);
				} else if (field[j][i] instanceof EmptyField) {
					System.out.print(field[j][i].toString() + " | ");
				} else {
					System.out.print("_" + " | ");
				}
			}
		}

		System.out.println("\n");
		System.out.println("Walk N E S W");
	}

}
