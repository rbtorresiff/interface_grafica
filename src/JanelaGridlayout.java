import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JanelaGridlayout extends JFrame {


	   public JanelaGridlayout() 	//construtor da classe
	   {	this.setTitle("GridLayout - Demonstração");
			this.setSize(400,200);
			this.setVisible(true);
			this.setResizable(false);
						
			// Obtem o Container do JFrame
			Container c = this.getContentPane();
			
			// Inclui o JPanel ao JFrame
			JPanel painel = new JPanel();
			c.add(painel);

			//Defini o Gerenciador de Layout
			// Grid de 3 linhas x 2 colunas, com espaçamento horizontal e vertical de 5px

			GridLayout layout = new GridLayout(3,2,5,5);
			
			//Layout aplicado ao JPanel
			painel.setLayout(layout);
			
			JButton botao1 = new JButton("UM");
			JButton botao2 = new JButton("DOIS");
			JButton botao3 = new JButton("TRÊS");
			JButton botao4 = new JButton("QUATRO");
			JButton botao5 = new JButton("CINCO");
			JButton botao6 = new JButton("SEIS");
			painel.add (botao1);		
			painel.add (botao2);
			painel.add (botao3);
			painel.add (botao4);
			painel.add (botao5);
			painel.add (botao6);
			
				
			// Metodos do objeto JFrame, usados no final do Construtor
			// para garantir que os novos componentes incluídos apareçam de forma correta
			this.setVisible(true);
			this.repaint();
			
		}

}
