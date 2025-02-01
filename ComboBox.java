import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ComboBox extends JComboBox {
	public ComboBox() {
		super();
		this.init();
	}

	public ComboBox(final Object[] items) {
		super(items);
		this.init();
	}

	public ComboBox(final DefaultComboBoxModel model) {
		super(model);
	}

	// public ComboBox(final Object[] items) {
	// super(items);
	// this.init();
	// }

	private void init() {

	}

}
