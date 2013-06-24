package br.com.senacrs.alp.aulas;

public interface LerArquivos {			

	String[] lerArquivo(String arquivo);

	String[] lerArquivoComSubstituicao(String arquivo, String busca, String substituicao);
}