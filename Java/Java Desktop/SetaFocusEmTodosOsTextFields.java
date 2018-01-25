//Classe Utilizada para Setar Focus em todos os jTextField
package Focus;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

public class FocusSelectAll {

	public FocusSelectAll(Container container) {
		adicionaFocusNosCampos(container);
	}

	public static void setaFocus(Container container) {
		adicionaFocusNosCampos(container);
	}

	private static void adicionaFocusNosCampos(Container container) {
		Component components[] = container.getComponents();

		for (int i = 0; i < components.length; i++) {
			if (components[i] instanceof JTextField) {
				final JTextField jtxt = (JTextField) components[i];

				jtxt.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						SwingUtilities.invokeLater(new Runnable() {

							@Override
							public void run() {
								jtxt.selectAll();

							}
						});

					}
				});

			}

			if (components[i] instanceof JFormattedTextField) {
				final JFormattedTextField jtxt = (JFormattedTextField) components[i];

				jtxt.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						SwingUtilities.invokeLater(new Runnable() {

							@Override
							public void run() {
								jtxt.selectAll();

							}
						});

					}
				});

			}

			if (components[i] instanceof JComboBox) {

				JComboBox jcombo = (JComboBox) components[i];

				if (jcombo.isEditable()) {
					final JTextComponent jtextComp = (JTextComponent) jcombo.getEditor().getEditorComponent();
					jtextComp.addFocusListener(new FocusListener() {

						@Override
						public void focusLost(FocusEvent arg0) {
							// TODO Auto-generated method stub

						}

						@Override
						public void focusGained(FocusEvent arg0) {
							SwingUtilities.invokeLater(new Runnable() {

								@Override
								public void run() {
									jtextComp.selectAll();
								}
							});

						}
					});
				}
			}

			if (components[i] instanceof JDateChooser) {

				JDateChooser dateChooser = (JDateChooser) components[i];
				dateChooser.getDateEditor().getUiComponent().addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent evt) {
						((JTextFieldDateEditor) evt.getSource()).selectAll();
					}
				});

			}

		}
	}

}
