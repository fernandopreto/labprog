package br.com.senacrs.alp.aulas;

public class FilaFactory {
	
	private static final FilaFactory instancia = new FilaFactory();
	
	private FilaFactory() {
	}
	
	public <T> Fila<T> criarFila() {
		
		Fila<T> resultado = null;
		
		//implementar
		
		resultado = new MinhaFila<T>();
		
		return resultado;
	}
	
	public static FilaFactory getInstancia() {
		return instancia;
	}
}
