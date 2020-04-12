package minesweeper;

public class NoMine implements Field {
	boolean visited = false;
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	
	@Override
	public void check(Player player) {
		player.noBoom();
	}
	
	@Override
	public String toString() {
		return "N";
	}
}
