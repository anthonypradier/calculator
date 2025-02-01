
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Calculator calculator = new Calculator();
			}
		});
	}
}
