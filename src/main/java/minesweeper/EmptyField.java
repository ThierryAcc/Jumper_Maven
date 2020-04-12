package minesweeper;

public class EmptyField implements Field {
	boolean visited = false;
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}


	@Override
	public void check(Player player) {
		System.out.println("Already visited");
	}
	
	@Override
	public String toString() {
		return "E";
	}

}
