public class ModifiableStringModel extends StringModel {
	public ModifiableStringModel() {
		super();
	}

	public ModifiableStringModel(final String[] strings) {
		super(strings);
	}

	public void clearStrings() {
		int oldSize = this.getSize();
		this.getStrings().clear();
		this.fireIntervalRemoved(this, 0, oldSize);
	}

	public void addString(final String s) {
		this.getStrings().add(s);
		int newSize = this.getSize();
		this.fireIntervalAdded(this, newSize, newSize);
	}

	public void removeString(final String s) {
		int position = this.getIndexOf(s);
		this.getStrings().remove(position);
		this.fireIntervalRemoved(this, position, position);
	}
}
