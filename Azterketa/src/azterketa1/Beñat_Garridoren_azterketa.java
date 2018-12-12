package azterketa1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class Beñat_Garridoren_azterketa extends JFrame {

	private JPanel contentPane;
	private JTextField Izena;
	private JPasswordField Pasahitza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Beñat_Garridoren_azterketa frame = new Beñat_Garridoren_azterketa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Beñat_Garridoren_azterketa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Izena = new JTextField();
		Pasahitza.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				Izena.selectAll();
			}
		});
		Izena.addActionListener((ActionListener) this);
		Izena.setBounds(92, 114, 86, 20);
		contentPane.add(Izena);
		Izena.setColumns(10);
		
		Pasahitza = new JPasswordField();
		Pasahitza.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				Pasahitza.selectAll();
			}
		});
		Pasahitza.addActionListener((ActionListener) this);
		Pasahitza.setBounds(265, 114, 103, 20);
		contentPane.add(Pasahitza);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea");
		lblErabiltzailea.setBounds(10, 117, 72, 14);
		contentPane.add(lblErabiltzailea);
		
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setBounds(200, 117, 46, 14);
		contentPane.add(lblPasahitza);
		
		JLabel lblAurrera = new JLabel("Aurrera");
		lblAurrera.setBounds(177, 169, 86, 52);
		contentPane.add(lblAurrera);
	}
}
