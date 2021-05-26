import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JanelaBorderlayout extends JFrame {


	   public JanelaBorderlayout() 	//construtor da classe
	   {	this.setTitle("BorderLayout - Demonstração");
			this.setSize(500,200);
			this.setVisible(true);
			this.setResizable(false);
						
			// Obtem o Container do JFrame
			Container c = this.getContentPane();
			
			// Inclui o JPanel ao JFrame
			JPanel painel = new JPanel();
			c.add(painel);

			//Defini o Gerenciador de Layout
			BorderLayout layout = new BorderLayout();
			
			//Layout aplicado ao JPanel
			painel.setLayout(layout);
			
			JButton botao1 = new JButton("TOPO");
			JButton botao2 = new JButton("RODAPÉ");
			JButton botao3 = new JButton("ESQUERDA");
			JButton botao4 = new JButton("CENTRO");
			JButton botao5 = new JButton("DIREITA");
			painel.add (botao1,BorderLayout.NORTH);
			painel.add (botao2,BorderLayout.SOUTH);
			painel.add (botao3,BorderLayout.WEST);
			painel.add (botao4,BorderLayout.CENTER);
			painel.add (botao5,BorderLayout.EAST);
				
			// Metodos do objeto JFrame, usados no final do Construtor
			// para garantir que os novos componentes incluídos apareçam de forma correta
			this.setVisible(true);
			this.repaint();
			
		}

}
