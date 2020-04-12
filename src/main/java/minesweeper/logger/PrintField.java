package minesweeper.logger;

import minesweeper.Field;
import minesweeper.Player;

public interface PrintField {
	public void drawField(int SIZE, Player player, Field field[][]);
}
