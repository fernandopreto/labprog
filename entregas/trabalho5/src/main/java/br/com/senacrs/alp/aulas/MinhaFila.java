/*package br.com.senacrs.alp.aulas;

public class MinhaFila<T> implements Fila<T>{//implements Fila
	
	Lista<T> lista = ListaFactory.getInstancia().criarLista();//instancia da lista
	
	@Override
	public void insercao(Object valor) {
		// TODO Auto-generated method stub
		
		lista.adicionarPosicao(lista.obterTamanho(), valor);
		
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

}*/

package br.com.senacrs.alp.aulas;

public class MinhaFila<T> implements Fila<T> {

	Lista<T> lista = ListaFactory.getInstancia().criarLista();

	@Override
	public void insercao(T valor) {

		lista.adicionarPosicao(lista.obterTamanho(), valor);

	}

	@Override
	public T obter() {
		
		return lista.obterPosicao(0);

		//return null;

	}

	@Override
	public T remocao() {

		return lista.removerPosicao(0);

	}

	@Override
	public boolean vazia() {
		
		boolean resultado = true;
		
		if(lista.obterTamanho()>0) {
			resultado = false;
		}
		return resultado;

	}

	@Override
	public int tamanho() {

		return lista.obterTamanho();

	}

	@Override
	public void esvaziar() {

		lista.esvaziar();

	}

}
