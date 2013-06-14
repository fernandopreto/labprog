package br.com.senacrs.alp.aulas;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class MinhaValidacao implements ValidarRequisicaoGet{

	@Override
	public boolean ehRequisicaoGetValida(Reader requisicao) {
		
		String[] linha = new String[2];
		
		boolean resultado = false;
		
		if(requisicao == null){
			throw new IllegalArgumentException();
		}
		
		BufferedReader lerlinha = new BufferedReader(requisicao);
		
		try {
			linha[0] = lerlinha.readLine();
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		try {
			linha[1] = lerlinha.readLine();
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		
		return resultado;
	}

}
