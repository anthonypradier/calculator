public class Calculator {
	private Window window;

	public Calculator() {
		this.loadComponents();
		this.window.setVisible(true);
	}

	private void loadComponents() {
		this.window = new Window();
	}
}
