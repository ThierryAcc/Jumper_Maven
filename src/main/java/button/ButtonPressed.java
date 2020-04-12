package button;

public class ButtonPressed implements ButtonInterface {
	@Override
	public ButtonInterface press() {
		System.out.println("The button is already pressed");
		return new ButtonDefect();
	}
}
