//Classe Utilizada para Definir o Tamanho da Coluna da Tabela
package jtables;

import javax.swing.JTable;

public class TamanhoColunaTabela
{

	public void defineTamanhoColunaTabela(JTable table, int valor, int coluna) {
		
		if(table != null){
			table.getColumnModel().getColumn(coluna).setMinWidth(0);
			table.getColumnModel().getColumn(coluna).setMaxWidth(valor);
			table.getColumnModel().getColumn(coluna).setPreferredWidth(valor);
		}
		
		
	}
	

	
     public void defineTamanhoColunaTabelaAjustavel(JTable table, int valor, int coluna)
     {		
		if(table != null)
	    {
			table.getColumnModel().getColumn(coluna).setMinWidth(0);			
	        table.getColumnModel().getColumn(coluna).setPreferredWidth(valor);
		}
		
		
	}
	
	
	
	
}
