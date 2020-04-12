package button;

public class ButtonUnpressed implements ButtonInterface {
	@Override
	public ButtonInterface press() {
		System.out.println("Button not pressed");
		return new ButtonPressed();
	}
}
