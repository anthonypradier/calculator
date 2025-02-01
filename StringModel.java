import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class StringModel extends DefaultComboBoxModel {
	private ArrayList<String> strings;

	public StringModel(final String[] strings) {
		this.strings = new ArrayList<String>();
		for (String s : strings) {
			this.strings.add(s);
		}
	}

	public StringModel() {
		this.strings = new ArrayList<String>();
	}

	protected ArrayList<String> getStrings() {
		return this.strings;
	}

	public String getSelectedString() {
		return (String) this.getSelectedItem();
	}

	@Override
	public Object getElementAt(final int i) {
		return this.strings.get(i);
	}

	@Override
	public int getSize() {
		return this.strings.size();
	}

	@Override
	public int getIndexOf(final Object o) {
		return this.strings.indexOf(o);
	}
}
