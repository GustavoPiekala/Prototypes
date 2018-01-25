//Classe Utilizada para validar CEPs

package valida;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Canela1
 */
public class ValidaCep {

	// valida cep sem traco
	public boolean validaCepSemTraco(String cep) {

		boolean validacao = true;

		cep = cep.replace("-", "");

		Pattern pattern = Pattern.compile("^\\d{5,5}\\d{3,3}$");
		Matcher matcher = pattern.matcher(cep);

		if (matcher.find()) {
			validacao = true;
		} else {
			validacao = false;
		}

		return validacao;

	}

}