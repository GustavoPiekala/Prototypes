//Classe Utilizada para Definir Cursor de Processando ou Cursos Default

package Cursor;

import java.awt.Component;
import java.awt.Cursor;

public class DefinirCursor {
	
	public static void cursorProcessando(Component c) {
		c.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
	}

	public static void cursorPadrao(Component c) {
		c.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}

}
