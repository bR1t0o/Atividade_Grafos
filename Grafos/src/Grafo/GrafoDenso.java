package Grafo;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GrafoDenso implements Grafo_Interface{

	private int [][]  matriz_adjacencia;
	Map<String,Integer> rotulos = new HashMap<>();
	int[] rot;
	public GrafoDenso(int v) {
		matriz_adjacencia= new int[v][v];
	}
	
	
	public GrafoDenso(String v) {
		String arr[] = v.strip().split("\\s+");
		//System.out.println(Arrays.toString(arr));
		int size = arr.length;
		
		matriz_adjacencia = new int[size][size];
		
		for (int i = 0; i < arr.length; i++) {
			
				rotulos.put(arr[i],i);
			
		}
	}
	@Override
	public int numero_de_vertice() {
		// TODO Auto-generated method stub
		return matriz_adjacencia.length;
	}

	@Override
	public int numero_de_arestas() {
		int counter = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < matriz_adjacencia.length; i++) {
	
			for (int j = 0; j < matriz_adjacencia[i].length; j++) {
				if (matriz_adjacencia[i][j] != 0){
					counter++;
				}
			}
			
		}
		return counter/2;
	}

	@Override
	public int[] sequencia_de_graus() {
		// TODO Auto-generated method stub
		int counter = 0;
		int[] seq = new int[numero_de_vertice()];
		for (int i = 0; i < matriz_adjacencia.length; i++) {
			for (int j = 0; j < matriz_adjacencia[i].length; j++) {
				
				if (matriz_adjacencia[i][j] != 0){
					//counter = counter + matriz_adjacencia[i][j];
					counter++;
				}
			}
			seq[i] = counter;
			//System.out.print(counter);
			counter = 0;
		}
		Arrays.sort(seq);
		return seq;
	}

	@Override
	public void adicionar_aresta(Integer vertice_A, Integer vertice_B) {
		// TODO Auto-generated method stub
		matriz_adjacencia[vertice_A-1][vertice_B-1] = 1;
		matriz_adjacencia[vertice_B-1][vertice_A-1] = 1;
	}
	@Override
	public void adicionar_aresta(String vertice_A, String vertice_B) {
		// TODO Auto-generated method stub
		
		matriz_adjacencia[rotulos.get(vertice_A)][rotulos.get(vertice_B)] = 1;
		matriz_adjacencia[rotulos.get(vertice_B)][rotulos.get(vertice_A)] = 1;
	}
	@Override
	public void remover_aresta(Integer vertice_A, Integer vertice_B) {
		// TODO Auto-generated method stub
		matriz_adjacencia[vertice_A-1][vertice_B-1] = 0;
		matriz_adjacencia[vertice_B-1][vertice_A-1] = 0;
	}
	public void remover_aresta(String vertice_A, String vertice_B) {
		// TODO Auto-generated method stub
		matriz_adjacencia[rotulos.get(vertice_A)][rotulos.get(vertice_B)] = 0;
		matriz_adjacencia[rotulos.get(vertice_B)][rotulos.get(vertice_A)] = 0;
	}
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < matriz_adjacencia.length; i++) {
			for (int j = 0; j < matriz_adjacencia[i].length; j++) {
				System.out.print(matriz_adjacencia[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public  int[][] get_matriz() {
		int m[][] = matriz_adjacencia;
		return m;
		
	}

	
}
//tava com hashmap na cabeça/mente e fiz um mas aí deu errado pq tava tentando associar arr com matriz[i][j], vi como fazer. Daí percebi que nao precisa 
//mas aí vi depois que com o hashmap vira O(1) e com o indexOf vira O(n)
// concertar o número de arestas