package Model;

public class PilhaString {

	NoString topo;
	
	public PilhaString() {
		topo = null;
	}
	
	public void push(String dado) {
		NoString elemento = new NoString();
		elemento.dado = dado;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public boolean isEmpty () {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public String pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		String valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoString aux = topo;
			while(aux != null) {
				cont++;
				aux = aux.proximo;
			}
		}
		return cont;
	}
	

}
