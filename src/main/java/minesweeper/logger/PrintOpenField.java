package minesweeper.logger;

import minesweeper.Field;
import minesweeper.Player;

public class PrintOpenField implements PrintField {

	@Override
	public void drawField(int SIZE, Player player,Field[][] field) {
		for (int i = 0; i < SIZE; i++) {
			System.out.println();
			for (int j = 0; j < SIZE; j++) {
				if (field[j][i] instanceof Player) {
					System.out.print(field[j][i].toString() + " | ");
					player.setX(j);
					player.setY(i);
				} else {
					System.out.print(field[j][i].toString() + " | ");
				}
			}
		}
		

		System.out.println("\n");
		System.out.println("Walk N E S W");
	}

}
