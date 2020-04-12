package minesweeper;

import java.util.Scanner;

public class Player implements Field {
	boolean visited = false;
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	
	private int lives;
	private int x;
	private int y;

	public Player() {
		this.lives = 3;
	}
	
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void boom() {
		System.out.println("BOOM! LOST 1 LIFE");
		lives--;
	}

	public void noBoom() {
		System.out.println("LUCKY! NO MINE HERE");
	}

	public boolean isAlive() {
		return lives > 0;
	}

	public void wins() {
		System.out.println("YOU WON");
	}

	public void walk(Scanner s, Field[][] field) {
		System.out.println("You can walk N E S W");
		String direction = s.nextLine();
		if(direction == "N") {
			checkBoundaries(field);
		}
	}
	
	public static void checkBoundaries(Field[][] field) {
		
	}
	
	public boolean hasWon() {
		return true;
	}

	@Override
	public void check(Player player) {

	}

	@Override
	public String toString() {
		return "P";
	}

}
