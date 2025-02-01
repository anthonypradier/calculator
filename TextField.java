import javax.swing.JTextField;

import org.w3c.dom.Text;

public class TextField extends JTextField {
	public TextField() {
		super();
		this.init();
	}

	private void init() {
		this.setColumns(10);
	}
}
