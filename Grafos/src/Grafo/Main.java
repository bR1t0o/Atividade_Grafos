package Grafo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		GrafoDenso grafo = new GrafoDenso("A B C D E");
		grafo.adicionar_aresta("A","B");
		grafo.adicionar_aresta("A","C");
		grafo.adicionar_aresta("C","D");
		grafo.adicionar_aresta("C","E");
		grafo.adicionar_aresta("B","D");
		
		grafo.imprimir();
		System.out.println(grafo.numero_de_vertice());
		System.out.println(grafo.numero_de_arestas());
		System.out.println(Arrays.toString(grafo.sequencia_de_graus()));
		
		grafo.remover_aresta("A", "C");
		grafo.imprimir();
		
	
	}

}
