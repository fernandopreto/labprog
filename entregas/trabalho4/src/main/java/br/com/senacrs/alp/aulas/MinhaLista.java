package br.com.senacrs.alp.aulas;

public class MinhaLista<T> implements Lista<T> {
	
	private Nodo<T> inicio = new Nodo<T>();
	
	@Override
	public void adicionarFinal(T valor) {
		
		adicionarPosicao(obterTamanho(),valor);
	}

	@Override
	public void adicionarInicio(T valor) {
		
		adicionarPosicao(0, valor);
		
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		
		Nodo<T> nodo = inicio;
		nodo = nodo.proximo;
		
		
	}

	@Override
	public T obterPrimeiro() {
		
		Nodo<T> nodo = null;
		
		nodo = obterNodoPosicao(0);
		
		return nodo.conteudo;
	}

	@Override
	public T obterUltimo() {
		
		int tamanho = obterTamanho();
		T resultado = obterPosicao(tamanho -1);
		return resultado;
	}

	@Override
	public T obterPosicao(int posicao) {
		Nodo<T> nodo = null;
		nodo = obterNodoPosicao(posicao);
		return nodo.conteudo;
	}

	@Override
	public int obterTamanho() {
		
		int resultado = 0;
		Nodo<T> nodo = null;
		
		nodo = inicio;
		while (nodo.proximo != null) {
			nodo = nodo.proximo;
			resultado++;
		}
		return resultado;
	}
		

	@Override
	public T removerPosicao(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub
		
	}
	private Nodo<T> obterNodoPosicao(int posicao){
		Nodo<T> nodo = inicio;
		int indice = -1;
		while(posicao!=indice){
			nodo = nodo.proximo;
			indice++;
		}
		
		return nodo;
	}
}
