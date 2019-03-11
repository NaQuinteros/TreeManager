package vista;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class UIMainWindow {

	private JFrame frmTreemanager;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField;
	private JTree tree;


	/**
	 * Create the application.
	 */
	public UIMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTreemanager = new JFrame();
		frmTreemanager.setTitle("TreeManager");
		frmTreemanager.setBounds(100, 100, 818, 575);
		frmTreemanager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTreemanager.getContentPane().setLayout(null);
		frmTreemanager.setVisible(true);
		
		tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Christopher\t") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("color");
						node_1.add(new DefaultMutableTreeNode("blue"));
						node_1.add(new DefaultMutableTreeNode("violet"));
						node_1.add(new DefaultMutableTreeNode("red"));
					add(node_1);
					add(new DefaultMutableTreeNode("sskdskdmksdmskdmcv ,\t"));
				}
			}
		));
		tree.setBounds(0, 11, 458, 512);
		frmTreemanager.getContentPane().add(tree);
		
		
		JLabel lblDatosPersonales = new JLabel("DATOS PERSONALES");
		lblDatosPersonales.setBounds(468, 12, 120, 14);
		frmTreemanager.getContentPane().add(lblDatosPersonales);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(468, 37, 86, 14);
		frmTreemanager.getContentPane().add(lblNombre);
		
		Label lblApellido = new Label("Apellido:");
		lblApellido.setBounds(468, 57, 86, 22);
		frmTreemanager.getContentPane().add(lblApellido);
		
		JLabel lblPuntosPropios = new JLabel("Puntos Personales:");
		lblPuntosPropios.setBounds(472, 116, 120, 14);
		frmTreemanager.getContentPane().add(lblPuntosPropios);
		
		JLabel lblPuntosDeRed = new JLabel("Puntos de Red:");
		lblPuntosDeRed.setBounds(472, 141, 99, 14);
		frmTreemanager.getContentPane().add(lblPuntosDeRed);
		
		Button button = new Button("Agregar Miembro");
		button.setBounds(468, 169, 120, 22);
		frmTreemanager.getContentPane().add(button);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setEditable(false);
		txtNombre.setBounds(560, 34, 232, 20);
		frmTreemanager.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBackground(Color.WHITE);
		txtApellido.setBounds(560, 59, 232, 20);
		frmTreemanager.getContentPane().add(txtApellido);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(564, 110, 120, 20);
		frmTreemanager.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(564, 138, 120, 20);
		frmTreemanager.getContentPane().add(textField_6);
		
		JButton btnEliminarMiembro = new JButton("Eliminar Miembro");
		btnEliminarMiembro.setBounds(468, 199, 120, 23);
		frmTreemanager.getContentPane().add(btnEliminarMiembro);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(610, 169, 89, 23);
		frmTreemanager.getContentPane().add(btnEditar);
		
		JLabel lblMeta = new JLabel("Meta");
		lblMeta.setBounds(468, 85, 46, 14);
		frmTreemanager.getContentPane().add(lblMeta);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(560, 82, 120, 20);
		frmTreemanager.getContentPane().add(textField);
	}

	public JFrame getFrmTreemanager() {
		return frmTreemanager;
	}

	public void setFrmTreemanager(JFrame frmTreemanager) {
		this.frmTreemanager = frmTreemanager;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTree getTree() {
		return tree;
	}

	public void setTree(JTree tree) {
		this.tree = tree;
	}
	
}
