package br.com.senacrs.alp.aulas;

public class ListaFactory {
	
	private static final ListaFactory instancia = new ListaFactory();
	
	private ListaFactory() {
	}
	
	public <T> Lista<T> criarLista() {
		
		Lista<T> resultado = null;
		
		resultado = new MinhaLista<T>();//isto é o que foi implementado
		
		return resultado;
	}//nova classe - ListaDeM implements Lista<T>
	
	public static ListaFactory getInstancia() {
		return instancia;
	}
}
