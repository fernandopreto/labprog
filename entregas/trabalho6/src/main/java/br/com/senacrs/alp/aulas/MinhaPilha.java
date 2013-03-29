package br.com.senacrs.alp.aulas;

public class MinhaPilha<T> implements Pilha<T> {

	Lista<T> lista = ListaFactory.getInstancia().criarLista();

	@Override
	public void insercao(T valor) {
		// TODO Auto-generated method stub
		lista.adicionarPosicao(lista.obterTamanho(), valor);
	}

	@Override
	public T obter() {
		// TODO Auto-generated method stub
		return lista.obterPosicao(0);
	}

	@Override
	public T remocao() {
		// TODO Auto-generated method stub
		return lista.removerPosicao(0);
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		boolean resultado = true;
		;
		if (lista.obterTamanho() > 0) {
			resultado = false;
		}
		return resultado;
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return lista.obterTamanho();
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub
		lista.esvaziar();

	}

}
