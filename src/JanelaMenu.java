import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JanelaMenu extends JFrame{

	   /**
	 * 
	 */
	private static final long serialVersionUID = 1868337274225642069L;

	public JanelaMenu() 	//construtor da classe
	   {	this.setTitle("Tela de Acesso ao Sistema");
			this.setSize(500,300);
			this.setVisible(true);
			this.setResizable(false);
			
			// Obtem o Container do JFrame
			Container c = this.getContentPane();

			// Inclui o JPanel ao JFrame
			JPanel painel = new JPanel();
			c.add(painel);
			
            // Inclução de Barra de Menu
			JMenuBar barramenu = new JMenuBar();
			
			JMenu menu1 = new JMenu("Cadastrar"); 
			JMenu menu2 = new JMenu("Sobre");      

			menu2.addMouseListener(new MouseListener()
			{	@Override
				public void mouseClicked(MouseEvent e)
					{ JOptionPane.showMessageDialog(null, "Sistema de Exemplo - GUI Java!");
					  	
					}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

			 				});
			
			//
		
			JMenuItem item1 = new JMenuItem("Inserir");
			JMenuItem item2 = new JMenuItem("Sair");

			
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
