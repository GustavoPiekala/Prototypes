//Classe utilizada para Estilizar os jTables de acordo com o tipo de dado definido no TableModel

package tablerenderer;

import java.awt.Color;
import java.awt.Component;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import numeros.ConverteBigDecimal;

public class TableRendererPadrao extends DefaultTableCellRenderer 
{
	
	private String formatoData;
	
	public TableRendererPadrao() {
		this.formatoData = "dd/MM/yyyy";
	}
	
	public TableRendererPadrao(String formatoData)
	{
		this.formatoData = formatoData;
	}
	
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel renderedLabel = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);         
        Object val = table.getValueAt(row, column);
        
        setHorizontalAlignment(LEFT);
        
        if(val instanceof Date)
        {
        	SimpleDateFormat sdf = new SimpleDateFormat(this.formatoData);        	
        	setText(sdf.format((Date)val)); 
         	
        }
        
        if(val instanceof BigDecimal)
        {
                setText(ConverteBigDecimal.bigDecimalToString((BigDecimal)val, 2));
              	setHorizontalAlignment(RIGHT);
        }
        
        if(val instanceof Double)
        {
                BigDecimal vlr = new BigDecimal((Double)val);            
                setText(ConverteBigDecimal.bigDecimalToString(vlr, 2));
              	setHorizontalAlignment(RIGHT);
        }
        
        if(val instanceof Integer)
        {
            setHorizontalAlignment(RIGHT);
        }
            
        

        //define a cor da Grid
        table.setGridColor(new Color(217, 214, 209));

        Color foreground = null, background = null;

        if(hasFocus){
        	  foreground = Color.white;
              background = Color.BLUE;
        }
        if (isSelected) {
            foreground = Color.white;
            background = new Color(48,103,249);
        } else {
            if (row % 2 == 0) {
                foreground = new Color(54, 54, 54);
                background = new Color(255, 255, 255);
              
            } else {
                foreground = new Color(54, 54, 54);
                //background = new Color(202, 225, 255);
                background = new Color(232, 232, 232);
            }
        }
 
        
        renderedLabel.setForeground(foreground);
        renderedLabel.setBackground(background);
        
 
        return renderedLabel;
    }
    

}
