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
	// private ComboBox combobox1;
	// private ComboBox combobox2;
	private JComboBox combobox1;
	private JComboBox combobox2;

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
		this.textField1.setColumns(10);

		this.btn1 = new JButton(new BtnAction(this, "Copier", 1));
		this.btn2 = new JButton(new BtnAction(this, "Enlever", 2));
		this.btn3 = new JButton(new BtnAction(this, "Vider", 3));

		this.textField2 = new TextField();
		this.textField2.setColumns(10);

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

		// this.contentPane.add(this.textField1);
		// this.contentPane.add(this.textField2);

		// this.contentPane.add(this.calculBtn);

		// this.contentPane.add(this.label);

		this.contentPane.add(this.combobox1);
		this.contentPane.add(this.btn1);
		this.contentPane.add(this.combobox2);
		this.contentPane.add(this.btn2);
		this.contentPane.add(this.btn3);

		this.setContentPane(this.contentPane);
	}

	private void buildComboBox() {
		String[] items = new String[] { "item 1", "item 2", "item 3", "item 4" };
		this.combobox1 = new JComboBox(new StringModel(items));
		this.combobox2 = new JComboBox(new ModifiableStringModel(items));
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

	// public ComboBox getComboBox(final int n) {
	// switch (n) {
	// case 1:
	// return this.combobox1;
	// case 2:
	// return this.combobox2;
	// default:
	// return null;
	// }
	// }

	public StringModel getStringModel1() {
		return (StringModel) this.combobox1.getModel();
	}

	public ModifiableStringModel getStringModel2() {
		return (ModifiableStringModel) this.combobox2.getModel();
	}

	public JLabel getLabel() {
		return this.label;
	}
}
