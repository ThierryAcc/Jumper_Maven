package button;

public class ButtonDefect implements ButtonInterface {

	@Override
	public ButtonInterface press() {
		System.out.println("the button is now broken");
		return this;
	}
}
