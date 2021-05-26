import javax.swing.JOptionPane;

public class TesteJOptionPane {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		String num1 = JOptionPane.showInputDialog("Digite o Primeiro Número:");
		String num2 = JOptionPane.showInputDialog("Digite o Segundo Número:");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null,"Primeiro Número: "+num1+" - Segundo Número: "+num2,"Soma de Números",JOptionPane.INFORMATION_MESSAGE);
	        JOptionPane.showMessageDialog(null,"Soma dos Números: "+soma,"Tela de Resultados",JOptionPane.PLAIN_MESSAGE);
		
	}

}
