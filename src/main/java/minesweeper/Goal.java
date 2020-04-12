package minesweeper;

public class Goal implements Field {
	boolean visited = false;
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}


	@Override
	public void check(Player player) {
		player.wins();
	}

	@Override
	public String toString() {
		return "G";
	}
	
	
}
