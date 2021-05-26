import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JanelaFlowlayout extends JFrame {


	   public JanelaFlowlayout() 	//construtor da classe
	   {	this.setTitle("Tela Alternativa 01");
			this.setSize(500,200);
			this.setVisible(true);
			this.setResizable(false);
						
			// Obtem o Container do JFrame
			Container c = this.getContentPane();
			
			// Inclui o JPanel ao JFrame
			JPanel painel = new JPanel();
			c.add(painel);

			//Defini o Gerenciador de Layout
			FlowLayout layout = new FlowLayout();
			layout.setAlignment(FlowLayout.LEFT);

			//Layout aplicado ao JPanel
			painel.setLayout(layout);
			

			// Componente JLabel
			JLabel rotulo1 = new JLabel("Informe o nome do usuário: ");
			rotulo1.setToolTipText("username");
			painel.add(rotulo1);
			
			// Componente JTextField
			JTextField caixa1 = new JTextField(25);
			painel.add(caixa1);

			// Componente JLabel e JPasswordField
			JLabel rotulo2 = new JLabel("Informe a senha de acesso: ");
			rotulo2.setToolTipText("password");
			painel.add(rotulo2);
			
			JPasswordField senha = new JPasswordField(25);
			painel.add(senha);
			
			// Componentes JButton
			
			JButton botao1 = new JButton("Centro");
			JButton botao2 = new JButton("Direita");
			JButton botao3 = new JButton("Esquerda");
			
			painel.add(botao1);
			painel.add(botao2);
			painel.add(botao3);
			
			// Eventos dos componentes JButton
			
			botao1.addActionListener(new ActionListener()     
			{	public void actionPerformed(ActionEvent e)
				{	layout.setAlignment(FlowLayout.CENTER);
				    layout.layoutContainer(painel); //realinha os componentes no painel

			}});
		
			botao2.addActionListener(new ActionListener()    	
			{	public void actionPerformed(ActionEvent e)
				{	layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(painel); //realinha os componentes no painel
				}});
		
			botao3.addActionListener(new ActionListener()   	
			{	public void actionPerformed(ActionEvent e)
				{	layout.setAlignment(FlowLayout.LEFT);
					layout.layoutContainer(painel); //realinha os componentes no painel
				}
			});
			
			// Metodos do objeto JFrame, usados no final do Construtor
			// para garantir que os novos componentes incluídos apareçam de forma correta
			this.setVisible(true);
			this.repaint();
			
		}

}
