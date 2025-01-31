import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class Window extends JFrame {
	public Window() {
		super();

		this.build();
	}

	private void build() {
		this.setTitle("Window");
		this.setSize(320, 240);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}