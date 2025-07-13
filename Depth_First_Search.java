import java.util.*;

class Depth_First_Search
{
    public static class Graph
    {
    ArrayList<Integer>[] adj_list;
    Graph(int no_of_vertices)
    {
        adj_list = new ArrayList[no_of_vertices];
        for(int i=0;i<adj_list.length;i++)
        {
            adj_list[i] = new ArrayList();
        }
    }
    
    void add_edge(int x, int y)
    {
        adj_list[x].add(y);
    }
    
    ArrayList<Integer> DFS(int source, ArrayList<Integer>[] adj_list)
    {
        int n = adj_list.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        
        ArrayList<Integer> traversal = new ArrayList<Integer>(n);
        
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(source);
        
        while(!stack.isEmpty())
        {
            int source_vertex = stack.peek();
            traversal.add(source_vertex);
            visited[source_vertex] = true;
            stack.pop();
            
            for(int i=0;i<adj_list[source_vertex].size();i++)
            {
                if((stack.contains(adj_list[source_vertex].get(i)) == false) || visited[adj_list[source_vertex].get(i)] == false)
                {
                    stack.push(adj_list[source_vertex].get(i));
                }
            }
        }
        return traversal;
    }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of vertices in your graph: ");
        int n = sc.nextInt();
        Graph graph = new Graph(n);
        graph.add_edge(0,4);
        graph.add_edge(0,2);
        graph.add_edge(2,3);
        graph.add_edge(3,1);
        /*graph.add_edge(0,1);
        graph.add_edge(0,4);
        graph.add_edge(1,0);
        graph.add_edge(1,3);
        graph.add_edge(2,3);
        graph.add_edge(3,1);
        graph.add_edge(3,5);
        graph.add_edge(3,2);
        graph.add_edge(4,0);
        graph.add_edge(4,5);
        graph.add_edge(5,4);
        graph.add_edge(5,3);*/
        
        
        ArrayList<Integer> traversal_route = graph.DFS(0, graph.adj_list);
        
        System.out.print("\nThe traversal route of the graph using DFS is: ");
        for(int i=0;i<traversal_route.size();i++)
        {
            System.out.print(traversal_route.get(i) + "  ");
        }
    }
}

 /* OUTPUT
----------------*/
/* Enter the no. of vertices in your graph: 5
The traversal route of the graph using DFS is: 0  2  3  1  4   */
  