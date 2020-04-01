package proiect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import xml.createXml;
import xml.marshalingExample;
import xml.pdf;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		Controller cmd = new Controller(this, new createXml(), new pdf(), new connections(), new marshalingExample());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(12, 53, 379, 101);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnCreateXmlusingDOM = new JButton("Create XML using DOM");
		btnCreateXmlusingDOM.addActionListener(cmd);
		btnCreateXmlusingDOM.setBackground(Color.RED);
		btnCreateXmlusingDOM.setBounds(12, 31, 165, 25);
		panel.add(btnCreateXmlusingDOM);

		JButton btnCreatePdfhtml = new JButton("Create PDF+HTML");
		btnCreatePdfhtml.addActionListener(cmd);
		btnCreatePdfhtml.setBackground(Color.RED);
		btnCreatePdfhtml.setBounds(188, 63, 165, 25);
		panel.add(btnCreatePdfhtml);
		
		JButton btnCreateHtml = new JButton("Create HTML");
		btnCreateHtml.setBackground(Color.RED);
		btnCreateHtml.addActionListener(cmd);
		btnCreateHtml.setBounds(189, 31, 165, 25);
		panel.add(btnCreateHtml);
		
		JButton btnCreateXmlUsing = new JButton("Create XML using JAXB");
		btnCreateXmlUsing.addActionListener(cmd);
		btnCreateXmlUsing.setBackground(Color.RED);
		btnCreateXmlUsing.setBounds(12, 63, 165, 25);
		panel.add(btnCreateXmlUsing);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(12, 180, 379, 60);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCale = new JLabel("Cale:");
		lblCale.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCale.setForeground(Color.RED);
		lblCale.setBounds(12, 13, 46, 34);
		panel_1.add(lblCale);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(59, 13, 308, 29);
		textArea.setText("hmmmm");
		panel_1.add(textArea);
	}
}
