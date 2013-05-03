package br.com.senacrs.alp.aulas;

import java.io.*;

public class MinhaLCD implements ListaConteudoDiretorio{

	@Override
	public String[] listarConteudo(File diretorio) {
		
		String resultado[] = null;
		
		String dir[] = "f:\\ADS";
		
		dir = File.listRoots();
		
		resultado = dir;
		
		return resultado;
	}

}
