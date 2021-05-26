import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JanelaMixlayout extends JFrame {


	   public JanelaMixlayout() 	//construtor da classe
	   {	this.setTitle("Mix de Layout´s - Demonstração");
			this.setSize(500,150);
			this.setVisible(true);
			this.setResizable(false);
						
			// Obtem o Container do JFrame
			Container c = this.getContentPane();
			
			// Inclui o JPanel ao JFrame
			JPanel painel_botoes = new JPanel();
			JPanel painel_rotulos = new JPanel();
			JPanel painel_caixas = new JPanel();
			
			//Defini o Gerenciador de Layout
			BorderLayout layout = new BorderLayout();
			GridLayout layoutbotoes = new GridLayout(1,5,5,5);
			GridLayout layoutrotulos = new GridLayout(3,1,5,5);
			
			//Layout aplicado ao JPanel
			c.setLayout(layout);
			painel_botoes.setLayout(layoutbotoes);
			painel_rotulos.setLayout(layoutrotulos);
			painel_caixas.setLayout(layoutrotulos);
			
			
			JButton botao1 = new JButton("Salvar");
			JButton botao2 = new JButton("Excluir");
			JButton botao3 = new JButton("Cancelar");
			JButton botao4 = new JButton("Imprimir");
			JButton botao5 = new JButton("Sair");
			painel_botoes.add (botao1);
			painel_botoes.add (botao2);
			painel_botoes.add (botao3);
			painel_botoes.add (botao4);
			painel_botoes.add (botao5);
			
			JLabel rotulo1 = new JLabel("Nome:");
			painel_rotulos.add(rotulo1);
			
			JLabel rotulo2 = new JLabel("Endereço: ");
			painel_rotulos.add(rotulo2);

			JLabel rotulo3 = new JLabel("E-mail: ");
			painel_rotulos.add(rotulo3);

			// Componente JTextField
			JTextField caixa1 = new JTextField(25);
			painel_caixas.add(caixa1);
			
			// Componente JTextField
			JTextField caixa2 = new JTextField(25);
			painel_caixas.add(caixa2);

			// Componente JTextField
			JTextField caixa3 = new JTextField(25);
			painel_caixas.add(caixa3);

			c.add(painel_botoes, BorderLayout.SOUTH);
			c.add(painel_rotulos, BorderLayout.WEST);
			c.add(painel_caixas, BorderLayout.CENTER);

			// Metodos do objeto JFrame, usados no final do Construtor
			// para garantir que os novos componentes incluídos apareçam de forma correta
			this.setVisible(true);
			this.repaint();
			
		}

}
