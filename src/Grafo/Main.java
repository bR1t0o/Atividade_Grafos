package Grafo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		GrafoDenso grafo = new GrafoDenso("A B C");
	/*	grafo.adicionar_aresta("A","B");
		grafo.adicionar_aresta("A","C");
		grafo.adicionar_aresta("C","D");
		grafo.adicionar_aresta("C","E");
		grafo.adicionar_aresta("B","D"); */
		grafo.adicionar_aresta("A","B");
		grafo.adicionar_aresta("A","C");
		grafo.adicionar_aresta("B","A");
		grafo.adicionar_aresta("B","C");
		grafo.adicionar_aresta("C","A");
		grafo.adicionar_aresta("C","B");
		System.out.println(grafo.isSimples());
		grafo.imprimir();
		System.out.println(grafo.numero_de_vertice());
		System.out.println(grafo.numero_de_arestas());
		System.out.println(Arrays.toString(grafo.sequencia_de_graus()));
		
		grafo.remover_aresta("A", "C");
		grafo.imprimir();
		
	
	}

}
