import javax.swing.JOptionPane;

public class TesteJOptionPane {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		String num1 = JOptionPane.showInputDialog("Digite o Primeiro N�mero:");
		String num2 = JOptionPane.showInputDialog("Digite o Segundo N�mero:");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null,"Primeiro N�mero: "+num1+" - Segundo N�mero: "+num2,"Soma de N�meros",JOptionPane.INFORMATION_MESSAGE);
	        JOptionPane.showMessageDialog(null,"Soma dos N�meros: "+soma,"Tela de Resultados",JOptionPane.PLAIN_MESSAGE);
		
	}

}
