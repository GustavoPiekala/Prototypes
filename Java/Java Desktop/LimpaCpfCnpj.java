//Classe Utilizada par Limpar os Cpf ou Cnpj com caracteres especiais - Deixando apenas com os n�meros
package cpf_cnpj;

public class LimpaCpfCnpj
{	
	public static String cnpjSemCaractesres(String cnpj)
	{
		return cnpj.replaceAll("[./-]", "").replaceAll(" ", "");
	}

}

