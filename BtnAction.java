import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class BtnAction extends AbstractAction {
	private Window window;
	private int type;
	private String text;

	public BtnAction(final Window window, final String text, final int type) {
		super(text);
		this.window = window;
		this.text = text;
		this.type = type;
	}

	@Override
	public void actionPerformed(final ActionEvent e) {
		if (this.type == 1) {
			this.copyItem();
		} else if (this.type == 2) {
			this.removeItem();
		} else if (this.type == 3) {
			this.removeAll();
		}
	}

	private void copyItem() {
		System.out.println(" test");
		StringModel c1 = this.window.getStringModel1();
		ModifiableStringModel c2 = this.window.getStringModel2();
		String select = c1.getSelectedString();
		c2.addString(select);
		System.out.println(select + " copié dans ComboBox2");
	}

	private void removeItem() {
		ModifiableStringModel c2 = this.window.getStringModel2();
		String select = c2.getSelectedString();
		c2.removeString(select);
		System.out.println(select + " enlevé de ComboBox 2");
	}

	private void removeAll() {
		ModifiableStringModel c2 = this.window.getStringModel2();
		c2.clearStrings();
		System.out.println("ComboBox 2 vidée");
	}
}
