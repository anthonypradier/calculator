import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class OperatorModel extends DefaultComboBoxModel {
	private ArrayList<String> operators;

	public OperatorModel() {
		super();
		this.operators = new ArrayList<String>();
		this.operators.add("+");
		this.operators.add("-");
		this.operators.add("*");
		this.operators.add("/");
	}

	public String getSelectedOperator() {
		return (String) this.getSelectedItem();
	}

	@Override
	public String getElementAt(final int i) {
		return this.operators.get(i);
	}

	@Override
	public int getSize() {
		return this.operators.size();
	}

	@Override
	public int getIndexOf(final Object o) {
		return this.operators.indexOf(o);
	}
}
