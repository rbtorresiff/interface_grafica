import java.awt.*;
import javax.swing.*;

public class JanelaParte02 extends JFrame {

	public JanelaParte02() 	//construtor da classe
	   {	this.setTitle("Tela de Acesso ao Sistema");
			this.setSize(500,300);
			this.setResizable(false);
			
			// Obtem o Container do JFrame
			Container c = this.getContentPane();

			// Inclui o JPanel ao JFrame
			JPanel painel = new JPanel();
			c.add(painel);

			JLabel rotulo3 = new JLabel("É obrigatório selecionar o(s) perfil(is) 	desejado(s) para acesso aos sistemas: ");		
 	        rotulo3.setToolTipText("perfil de acesso");			
		   	painel.add(rotulo3);
			

			// Componente JCheckBox
			JCheckBox escolha1 = new JCheckBox("Administrador",false);
			JCheckBox escolha2 = new JCheckBox("Programador",false);
			JCheckBox escolha3 = new JCheckBox("DBA",false);
			JCheckBox escolha4 = new JCheckBox("Usuário Final",true);
			JCheckBox escolha5 = new JCheckBox("Testador",false);

			painel.add(escolha1);
			painel.add(escolha2);
			painel.add(escolha3);
			painel.add(escolha4);
			painel.add(escolha5);

			// Componente JRadioButton e ButtonGroup
			
			JRadioButton radio1 = new JRadioButton("“Administrador",false);
			JRadioButton radio2 = new JRadioButton("Programador",false);
			JRadioButton radio3 = new JRadioButton("DBA",false);
			JRadioButton radio4 = new JRadioButton("Usuário Final",true);
			JRadioButton radio5 = new JRadioButton("Testador",false);
			
			ButtonGroup grupo = new ButtonGroup();
			grupo.add(radio1);
			grupo.add(radio2);
			grupo.add(radio3);
			grupo.add(radio4);
			grupo.add(radio5);

			painel.add(radio1);
			painel.add(radio2);
			painel.add(radio3);
			painel.add(radio4);
			painel.add(radio5);

			// Componente JComboBox
			String[] perfil = {"Administrador","Programador","DBA","Usuário Final","Testador"};
			JComboBox combo = new JComboBox(perfil);	
			combo.setMaximumRowCount(4);
			painel.add(combo);
			
			// Componente JList
			String[] relacao = {"Administrador","Programador","DBA","Usuário Final","Testador"};
			JList lista = new JList(relacao);
			lista.setVisibleRowCount(5);
			lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//			lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			painel.add(lista);
			

			// Metodos do objeto JFrame, usados no final do Construtor
			// para garantir que os novos componentes incluídos apareçam de forma correta
			this.setVisible(true);
			this.repaint();
			
		}

}
