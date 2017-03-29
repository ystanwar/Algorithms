import java.util.*;
import java.io.*;

	//this class represents  directed graph using adjacency matrix representation.
	class Graph{
		private int V; //#vertices
		private LinkedList<Integer> adj[];//Adjacency List
		
		Graph(int v)
		{
			V=v;
			adj = new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				adj[i] = new LinkedList();
			}
		}
		//add edge into graph
		 void addEdge(int v, int w)
		{
		adj[v].add(w);	
		}
		 
		 //print BFS travel from a given source 
		 
		 void BFS(int s) //s is starting point or root
		 {
			 //Mark all vertices as not visited 
			 //by default set as false.
			 
			 boolean visited[] = new boolean[V];
			 //queue for BFS
			 LinkedList<Integer> queue = new LinkedList<Integer>();
			 //Mark the current node as visited and enqueue it.
			 visited[s] = true;
			 queue.add(s);
			 
			 while(queue.size() != 0)
			 {
				 //Dequeue  vertex from queue and print it
				 s = queue.poll();
				 System.out.print(s + " ");
				 
				 //get all the vertices of dequeue vertex s
				 //if a adjacent has not been visited yet ,then mark it visited and enqueue it./
				 Iterator<Integer> i = adj[s].listIterator();
				 while(i.hasNext())
				 {
					 int n = i.next();
					 if(!visited[n])
					 {
						 visited[n]=true;
						 queue.add(n);
					 }
				 }
			 
			 }
		 }
	}
	public class BFS_graph {
	public static void main(String args[])
	{
		Graph g = new Graph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		System.out.println("Following is the BFS , starting from 2");
		g.BFS(2);
		
				
	}
}
