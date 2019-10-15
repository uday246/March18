import java.util.Arrays;
import java.util.Comparator;
class Vertex{}
public class Edge {
	public Vertex src;
	public Vertex dst;
	public double cost;
	public Edge(){

	}
	Edge(Vertex s, Vertex d, double c) {
		src = s;
		dst = d;
		cost = c;
	}
	public static void main(String[] args){



		// creates an edge between two vertices
		Graph graph = new Graph();
		Edge[] edges = graph.getEdges();
		Arrays.sort(edges, new SortByCost());
		for(Edge e:edges){
			System.out.print(e.cost+" ");
		}
	}
	//
	
}

class Graph{
	public Edge[] getEdges(){
		Edge e[] = new Edge[3];
		e[0] = new Edge(null,null,10);
		e[1] = new Edge(null,null,12);
		e[2] = new Edge(null,null,5);
		return e;
	}
}
class SortByCost implements Comparator<Edge> {
	public int compare(Edge a, Edge b) {
		if ( a.cost < b.cost ) return -1;
		else if ( a.cost == b.cost ) return 0;
		else return 1;
	}
}