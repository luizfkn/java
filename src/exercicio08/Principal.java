package exercicio08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
	
		JFrame formulario = new JFrame("Calculadora Simples");
		formulario.setSize(300, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel numero1 = new JLabel("Informe o primeiro numero:");
		numero1.setBounds(10, 10, 160, 20);
		
		JTextField campoNumero1 = new JTextField();
		campoNumero1.setBounds(170, 10, 30 , 20);
		
		JLabel numero2 = new JLabel("Informe o segundo numero:");
		numero2.setBounds(10, 40, 160, 20);
		
		JTextField campoNumero2 = new JTextField();
		campoNumero2.setBounds(170, 40, 30 , 20);
		
		JLabel operacao = new JLabel("Informe a opera��o:");
		operacao.setBounds(10, 70, 160, 20);
		
		
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(170, 70, 100, 30);
		combo.addItem("Soma");
		combo.addItem("Subtra��o");
		combo.addItem("Divis�o");
		combo.addItem("Multiplica��o");
		
		JButton botao = new JButton("Confirmar conta");
		botao.setBounds(75, 110, 130, 20);
		
		botao.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(campoNumero1.getText());
				int n2 = Integer.parseInt(campoNumero2.getText());
				double conta = 0;
			
			if(combo.getSelectedItem().equals("Soma")) {
				conta = n1+n2;
				JOptionPane.showMessageDialog(null, n1+" + "+n2+" = "+conta);
			}
				
			if(combo.getSelectedItem().equals("Subtra��o")) {
				conta = n1-n2;
				JOptionPane.showMessageDialog(null, n1+" - "+n2+" = "+conta);
			}
			
			if(combo.getSelectedItem().equals("Divis�o")) {
				conta = n1/n2;
				JOptionPane.showMessageDialog(null, n1+" / "+n2+" = "+conta);
			}
			
			if(combo.getSelectedItem().equals("Multiplica��o")) {
				conta = n1*n2;
				JOptionPane.showMessageDialog(null, n1+" X "+n2+" = "+conta);
			}
			
			campoNumero1.setText("");
			campoNumero2.setText("");
			campoNumero1.requestFocus();
			
			
			
			
			}
		});
		
		
		
		
		
		
		
		
		formulario.add(numero1);
		formulario.add(campoNumero1);
		formulario.add(numero2);
		formulario.add(campoNumero2);
		formulario.add(operacao);
		formulario.add(combo);
		formulario.add(botao);
		
		
		formulario.setVisible(true);

	}

}


