package br.com.senacrs.alp.aulas;

public class MeuIS implements InterpretadorStrings{

	@Override
	public TIPO_STRING lerString(String str) {

		TIPO_STRING resultado = null;
		
		if (ehComentario(str)) {
			resultado = TIPO_STRING.COMENTARIO;
		} else if (ehBemFormada(str)) {
			resultado = TIPO_STRING.BEM_FORMADA;
		}else if (ehMalFormada(str)) {
			resultado = TIPO_STRING.MAL_FORMADA;
		}
		
		return resultado;
	}

	private boolean ehMalFormada(String str) {
		
		return false;
	}

	private boolean ehBemFormada(String str) {
		
		return false;
	}

	private boolean ehComentario(String str) {
		
		boolean resultado = false;
		
		resultado = str.startsWith(PREFIXO_COMENTARIO);
		
		return resultado;
	}

}
