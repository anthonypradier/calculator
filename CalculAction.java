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
		System.out.println("Calcul...");
		String operator = this.window.getOperatorBox().getSelectedOperator();
		if (operator == null) {
			this.window.getLabel().setText("Il faut sélectionner un opérateur...");
			return;
		}
		double res = 0;
		try {
			int left = Integer.parseInt(this.window.geTextField(1).getText());
			int right = Integer.parseInt(this.window.geTextField(2).getText());
			switch (operator) {
				case "+":
					res = left + right;
					break;
				case "-":
					res = left - right;
					break;
				case "*":
					res = left * right;
					break;
				case "/":
					if (right == 0) {
						res = (left == 0) ? 0 : left / Math.abs(left) * Integer.MAX_VALUE;
					} else {
						res = left / right;
					}
					break;
			}
			this.window.getLabel().setText("Résultat : " + res);
			this.window.geTextField(1).setText("");
			this.window.geTextField(2).setText("");
		} catch (NumberFormatException err) {
			this.window.getLabel().setText("Un des deux opérandes n'est pas un nombre entier...");
		}
	}
}
