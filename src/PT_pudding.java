import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JPanel;

public class PT_pudding {

	private JFrame frmPtPudding;
	private JTextField tfkode;
	private JTextField tfNama;
	private JTextField tfHarga;
	private JTextField tfStok;
	private JLabel lblberhasil;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PT_pudding window = new PT_pudding();
					window.frmPtPudding.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PT_pudding() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmPtPudding = new JFrame();
		frmPtPudding.setForeground(Color.WHITE);
		frmPtPudding.setFont(new Font("Arial", Font.BOLD, 16));
		frmPtPudding.setTitle("PT pudding");
		frmPtPudding.setBounds(100, 100, 711, 452);
		frmPtPudding.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPtPudding.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama Barang :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(30, 141, 137, 29);
		frmPtPudding.getContentPane().add(lblNewLabel);
		
		tfkode = new JTextField();
		tfkode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfkode.setBounds(165, 112, 496, 19);
		frmPtPudding.getContentPane().add(tfkode);
		tfkode.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kode Barang  : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(30, 112, 137, 19);
		frmPtPudding.getContentPane().add(lblNewLabel_2);
		
		tfNama = new JTextField();
		tfNama.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfNama.setColumns(10);
		tfNama.setBounds(165, 148, 496, 19);
		frmPtPudding.getContentPane().add(tfNama);
		
		JLabel lblHargaBarang = new JLabel("Harga Barang : ");
		lblHargaBarang.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHargaBarang.setBounds(30, 180, 137, 29);
		frmPtPudding.getContentPane().add(lblHargaBarang);
		
		tfHarga = new JTextField();
		tfHarga.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfHarga.setColumns(10);
		tfHarga.setBounds(165, 187, 496, 19);
		frmPtPudding.getContentPane().add(tfHarga);
		
		JLabel lblStok = new JLabel("Stok : ");
		lblStok.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStok.setBounds(30, 219, 77, 29);
		frmPtPudding.getContentPane().add(lblStok);
		
		tfStok = new JTextField();
		tfStok.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfStok.setColumns(10);
		tfStok.setBounds(165, 223, 496, 19);
		frmPtPudding.getContentPane().add(tfStok);
		
		JPanel panel = new JPanel();
		panel.setBounds(350, 107, 77, -63);
		frmPtPudding.getContentPane().add(panel);
		
		lblberhasil = new JLabel("");
		lblberhasil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblberhasil.setBounds(42, 279, 590, 29);
		frmPtPudding.getContentPane().add(lblberhasil);
		
		JButton btnSAVE = new JButton("SAVE");
		btnSAVE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSAVE.setBounds(10, 372, 677, 21);
		frmPtPudding.getContentPane().add(btnSAVE);
		
		JLabel lblNewLabel_2_1 = new JLabel("PT Pudding");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(299, 26, 137, 19);
		frmPtPudding.getContentPane().add(lblNewLabel_2_1);
		
	
				
		
	
	}
}
