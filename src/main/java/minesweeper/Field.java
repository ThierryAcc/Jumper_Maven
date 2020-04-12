package minesweeper;

public interface Field {
	public void check(Player player);
	public boolean isVisited();
	public void setVisited(boolean visited);
}
