package Hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.Box.Filler;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class AtlassianConnectedSum {


	public static int main(int n, List<String> edges) {

		int x = 0, y = 0, sum = 0;
		n++;

		Set<Integer>[] graph = new HashSet[n];

		for (int i = 0; i < n; i++) {
			graph[i] = new HashSet<Integer>();
		}

		for (String str : edges) {
			String[] splittedEdge = str.split("\\s+");
			x = Integer.parseInt(splittedEdge[0]);
			y = Integer.parseInt(splittedEdge[1]);
			graph[x].add(y);
			graph[y].add(x);
		}

		boolean[] trace = new boolean[n];
		for (int t = 0; t < n; ++t) {
			if (!trace[t]) {
				sum += Math.ceil(Math.sqrt(DFSUtil(t, trace, graph)));
				System.out.println();
			}
		}

		return sum - 1;
	}

	static int DFSUtil(int v, boolean[] trace, Set<Integer>[] graph) {
		trace[v] = true;
		int count = 1;
		System.out.print(v + " ");
		for (int x : graph[v]) {
			if (!trace[x])
				count += DFSUtil(x, trace, graph);
		}

		return count;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> edges = new ArrayList<String>();
//		edges.add("8");
//		edges.add("4");

		edges.add("8 1");
		edges.add("5 8");
		edges.add("7 3");
		edges.add("8 6");

		System.out.println(main(8, edges));
	}
}





















//	public static int main2(int n, List<String> edges) { 
//		
//		LinkedList<Integer>[] graph = new LinkedList[n];
//		
//        for(int i = 0; i < n ; i++){ 
//        	graph[i] = new LinkedList<Integer>(); 
//        } 
//        
//		for(String str: edges)
//		{
//			String[] splittedEdge = str.split("\\s+");
//			fillGraph(graph, Integer.parseInt(splittedEdge[0])-1, Integer.parseInt(splittedEdge[1])-1);
//		}
//		
//		
//		connectedComponents(n, graph);
//		
//		return 0;
//	}

//    static void fillGraph(LinkedList<Integer>[] graph, int x, int y) {
//    	System.out.println(x + ","  + y);
//		graph[x].add(y);
//		graph[y].add(x);
//	}
//    
//    static void  DFSUtil(int v, boolean[] visited, LinkedList<Integer>[] graph) { 
//        visited[v] = true; 
//        System.out.print(v+" "); 
//        for (int x : graph[v]) { 
//            if(!visited[x]) DFSUtil(x,visited, graph); 
//        } 
//    } 
//    

//    static void  connectedComponents(int n, LinkedList<Integer>[] graph) { 
//        boolean[] visited = new boolean[n]; 
//        for(int v = 0; v < n; ++v) { 
//            if(!visited[v]) { 
//                DFSUtil(v,visited, graph); 
//                System.out.println(); 
//            } 
//        } 
//    } 
//      
//    

//}
