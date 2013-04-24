package br.com.senacrs.alp.aulas;

import java.io.*;

public class MeuLA implements LeitorArquivos{

	@Override
	public String[] lerArquivo(String arquivo) {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		file = new File(arquivo);
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String[] lerArquivoComSubstituicao(String arquivo, String busca,
			String substituicao) {
		
		return null;
	}

}
