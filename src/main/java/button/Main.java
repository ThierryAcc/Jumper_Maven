package button;

public class Main {

	public static void main(String[] args) {
		ButtonInterface button = new ButtonUnpressed();
		button = button.press();
		button = button.press();
		button = button.press();
		button = button.press();
		
		System.out.println("-------------");
		
		// state pattern is better than this alternative
		int pressed = 0;
		if (pressed == 0) {
			System.out.println("Pressed button");
			pressed++;
		}
		if (pressed == 1) {
			System.out.println("Button is pressed");
			pressed++;
		} if (pressed == 2) {
			System.out.println("Button is broke");
		}
	}

}
