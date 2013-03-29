package br.com.senacrs.alp.aulas;

public class MinhaFila<T> implements Fila{//implements Fila
	
	Lista<T> lista = ListaFactory.getInstancia().criarLista();//instancia da lista
	
	@Override
	public void insercao(Object valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object obter() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Object remocao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return lista.obterTamanho();
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub
		
	}

}
