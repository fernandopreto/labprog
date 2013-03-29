package br.com.senacrs.alp.aulas;

public interface Fila<T extends Object> {

	void insercao(T valor);

	T obter();//acontece na entrada - não remove - só consulta

	T remocao();//acontece na saída
	
	boolean vazia();//a fila esta vazia?

	int tamanho();//quantidade de elementos
	
	void esvaziar();//tirar todos os elementos
}
