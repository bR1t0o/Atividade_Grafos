package Grafo;

public interface Grafo_Interface  {

	public int numero_de_vertice();
	public int numero_de_arestas();
	public int[] sequencia_de_graus();
	public void  adicionar_aresta(Integer vertice_A, Integer  vertice_B );
	public void  adicionar_aresta(String vertice_A, String vertice_B );
	public void  remover_aresta(Integer vertice_A, Integer vertice_B );
	public void  remover_aresta(String vertice_A, String vertice_B );
	public void imprimir(); 
	
	
	
}
