import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {
	private JPanel contentPane;
	private JLabel label;
	private JButton calculBtn;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private TextField textField1;
	private TextField textField2;
	private JComboBox operatorBox;

	public Window() {
		super();
		this.initComponents();
		this.build();
	}

	private void initComponents() {
		this.calculBtn = new JButton(new CalculAction(this, "Calculer"));
		this.contentPane = new JPanel();
		this.label = new JLabel("Résultat: pas encore calculé");
		this.textField1 = new TextField();
		this.textField2 = new TextField();
		this.buildComboBox();
	}

	private void build() {
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout flowLayout = new FlowLayout();
		this.setLayout(flowLayout);

		this.contentPane.setBackground(Color.WHITE);
		this.contentPane.add(this.textField1);
		this.contentPane.add(this.operatorBox);
		this.contentPane.add(this.textField2);
		this.contentPane.add(this.calculBtn);
		this.contentPane.add(this.label);

		this.setContentPane(this.contentPane);
	}

	private void buildComboBox() {
		this.operatorBox = new JComboBox(new OperatorModel());

	}

	public TextField geTextField(final int n) {
		switch (n) {
			case 1:
				return this.textField1;
			case 2:
				return this.textField2;

			default:
				return null;
		}
	}

	public JButton getButton(final int n) {
		switch (n) {
			case 1:
				return this.btn1;
			case 2:
				return this.btn2;
			case 3:
				return this.btn3;
			default:
				return null;
		}
	}

	public OperatorModel getOperatorBox() {
		return (OperatorModel) this.operatorBox.getModel();
	}

	public JLabel getLabel() {
		return this.label;
	}
}
