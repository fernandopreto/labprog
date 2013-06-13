package br.com.senacrs.alp.aulas;

import java.io.Reader;

public class MinhaValidacao implements ValidarRequisicaoGet{

	@Override
	public boolean ehRequisicaoGetValida(Reader requisicao) {
		
		return false;
	}

}
