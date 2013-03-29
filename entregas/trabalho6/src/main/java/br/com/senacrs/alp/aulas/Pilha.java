package br.com.senacrs.alp.aulas;

public interface Pilha<T extends Object> {

	void insercao(T valor);//acontece na entrada
	
	T obter();//acontece na entrada - não remove
	
	T remocao();//acontece na entrada
	
	boolean vazia();//a pilha esta vazia?

	int tamanho();//nº de elementos
	
	void esvaziar();//limpar pilha
}
