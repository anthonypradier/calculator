import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JLabel;

public class CalculAction extends AbstractAction {
	private Window window;
	private String text;

	public CalculAction(final Window window, final String text) {
		super(text);
		this.window = window;
		this.text = text;
	}

	@Override
	public void actionPerformed(final ActionEvent e) {
		String text = this.window.geTextField().getText();
		System.out.println(text);
		this.window.geTextField().setText("");
		JLabel label = this.window.getLabel();
		label.setText(text);
	}
}
