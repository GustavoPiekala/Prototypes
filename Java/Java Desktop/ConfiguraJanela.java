//Classe Utilizada para definir algumas configurações iniciais do JFrame/JDialog
package configuracao.janelas;

import java.awt.AWTKeyStroke;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;

import javax.swing.JButton;

public class ConfiguraJanela {

	private Component c;

	public ConfiguraJanela(Component parComponente) {
		c = parComponente;
	}

	public void centralizarJanela() {
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		c.setBounds((screenSize.width - c.getWidth()) / 2, (screenSize.height - c.getHeight()) / 2, c.getWidth(), c.getHeight());

	}

	public void removeEnterTabBotao(JButton button) {
		HashSet conj = new HashSet(button.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
		conj.remove(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
		button.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

	}

	public void defineEnterTab() {

		HashSet conj = new HashSet(c.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
		conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
		c.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

	}

	public void defineEnterTabComponenteIndividual(Component comp) {

		HashSet conj = new HashSet(comp.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
		conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
		comp.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

	}

}
