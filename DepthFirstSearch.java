import java.util.*;

class Graph1{
	private int V; //no. of vertices 
	private LinkedList<Integer> adj[];
	
	//Constructor
	Graph1(int v)
	{
		V=v;
		adj = new LinkedList[V];
		for(int i=0;i<v;i++)
		{
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		
	}
	
	void DFSUtil(int v, boolean visited[])
	{
		visited[v] = true;
		System.out.println(v +" ");
		Iterator <Integer> i = adj[v].listIterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
			{
				DFSUtil(n,visited);
			}
		}
	}
	
	void DFS()
	{
		boolean visited[] = new boolean[V];
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
			{
				DFSUtil(i,visited);
			}
		}
	}
}






public class DepthFirstSearch {
	public static void main(String args[])
	{
		Graph1 g = new Graph1(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal");
 
        g.DFS();
	}
	

}
