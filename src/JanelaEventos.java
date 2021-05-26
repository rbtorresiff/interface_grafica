import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;


public class JanelaEventos extends JFrame 
{	
   public JanelaEventos() 	//construtor da classe
   {	this.setTitle("Tela Principal do Sistema - Exemplos de Tratamento de Eventos ");
		this.setSize(500,300);
		this.setVisible(true);
		this.setResizable(false);
		
		// Obtem o Container do JFrame
		Container c = this.getContentPane();

		// Inclui o JPanel ao JFrame
		JPanel painel = new JPanel();
		c.add(painel);

		// Componente JLabel
		JLabel rotulo1 = new JLabel("Informe seu Nome e pressione ENTER: ");
		painel.add(rotulo1);
		
		// Componente JTextField
		JTextField caixa1 = new JTextField(25);
		painel.add(caixa1);

		// Evento é executado quando pressiona ENTER no componente JTextField
		caixa1.addActionListener(new ActionListener()     
				{	public void actionPerformed(ActionEvent e)
					{ 
					JOptionPane.showMessageDialog(null,"Nome Informado:\n " + caixa1.getText() );
				}});

        // Inclução de Barra de Menu
		JMenuBar barramenu = new JMenuBar();	
		JMenu menu1 = new JMenu("Cadastros"); 
		JMenu menu2 = new JMenu("Sobre");      

		JMenuItem item1 = new JMenuItem("Inserir");
		JMenuItem item2 = new JMenuItem("Sair");
		
		// MenuListener é uma interface e precisa que todos seus métodos sejam referenciados
		// mesmo que não estejam sendo usados
		menu2.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
            	JOptionPane.showMessageDialog(null, "Evento Ativado - Menu SOBRE!");
            }

			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		item1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JanelaParte01 objParte01 = new JanelaParte01();
		 }
		 });

		 item2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 JOptionPane.showMessageDialog(null, "Sistema será encerrado!");
				 System.exit(0);
		 }
		 });
		
		menu1.add(item1);
		menu1.add(item2);
					
		barramenu.add(menu1);
		barramenu.add(menu2);
		this.setJMenuBar(barramenu);
					
		// Metodos do objeto JFrame, usados no final do Construtor
		// para garantir que os novos componentes incluídos apareçam de forma correta
		this.setVisible(true);
		this.repaint();
		
	}
   
}
