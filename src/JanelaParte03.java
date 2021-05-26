import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JanelaParte03 extends JFrame 
{
   
   public JanelaParte03() 	//construtor da classe
   {	this.setTitle("Tela Alternativa 03");
		this.setSize(500,300);
		this.setVisible(true);
		this.setResizable(false);
		
		// Obtem o Container do JFrame
		Container c = this.getContentPane();

		// Inclui o JPanel ao JFrame
		JPanel painel = new JPanel();
		painel.setBackground(Color.YELLOW);
		
		c.add(painel);

		// Componente JLabel
		JLabel rotulo1 = new JLabel("Informe o nome do usuário: ");
		rotulo1.setForeground(Color.RED); // cor da fonte do componente
		painel.add(rotulo1);
		
		// Componente JTextField
		JTextField caixa1 = new JTextField(25);
		painel.add(caixa1);
		
		// Componentes JButton
		
		JButton botao1 = new JButton("Entrar");
		JButton botao2 = new JButton("Limpar");
		JButton botao3 = new JButton("Fechar");
		
		painel.add(botao1);
		painel.add(botao2);
		painel.add(botao3);
		
		botao1.setBackground(Color.GREEN);
		// Eventos dos componentes JButton
		
		botao1.addActionListener(new ActionListener()     // botão ENTRAR
		{	public void actionPerformed(ActionEvent e)
			{	JOptionPane.showMessageDialog(null,"USUÁRIO: " +
	 				caixa1.getText() );
			botao1.setBackground(Color.BLUE); //cor de fundo

		}});
	
		botao2.addActionListener(new ActionListener()    	// botão LIMPAR
		{	public void actionPerformed(ActionEvent e)
			{	 	caixa1.setText("");					}});
	
		botao3.addActionListener(new ActionListener()   	// botão FECHAR
		{	public void actionPerformed(ActionEvent e)
			{	dispose();			    }
		});
		
		// Metodos do objeto JFrame, usados no final do Construtor
		// para garantir que os novos componentes incluídos apareçam de forma correta
		this.setVisible(true);
		this.repaint();
		
	}
}
