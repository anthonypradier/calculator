import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.tools.JavaFileObject;

public class Window extends JFrame {
	private JPanel contentPane;
	private JLabel label;
	private JButton calculBtn;
	private JTextField textField;

	public Window() {
		super();
		this.initComponents();
		this.build();
	}

	private void initComponents() {
		this.calculBtn = new JButton(new CalculAction(this, "Calculer"));
		this.contentPane = new JPanel();
		this.label = new JLabel("Pas de texte");
		this.textField = new JTextField();
		this.textField.setColumns(10);
	}

	private void build() {
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout flowLayout = new FlowLayout();
		this.setLayout(flowLayout);

		this.contentPane.setBackground(Color.WHITE);

		this.contentPane.add(this.calculBtn);

		this.contentPane.add(this.label);

		this.contentPane.add(this.textField);

		this.setContentPane(this.contentPane);
	}

	public JTextField geTextField() {
		return this.textField;
	}

	public JLabel getLabel() {
		return this.label;
	}
}
