import java.util.ArrayList;
import java.util.*;
class Breadth_First_Search
{
public static class Graph
{
    //ArrayList<Integer>[] adj_list;
    ArrayList<Integer>[] adj_list;
    Graph(int no_of_vertices)
    {
        //adj_list = new ArrayList<Integer>[no_of_vertices]; //  error: generic array creation
        adj_list = new ArrayList[no_of_vertices];
        for(int i=0;i<no_of_vertices;i++)
        {
            adj_list[i] = new ArrayList();
        } // Removed the <Integer>, no error of generic array
        //this.adj_list = new ArrayList<Integer>[](no_of_vertices);
    }

    public void add_edge(int x, int y)
    {
        adj_list[x].add(y);
    }

    public ArrayList<Integer> BFS(int source, ArrayList<Integer>[] adj_list)
    {
        int n = adj_list.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);

        ArrayList<Integer> traversal = new ArrayList<Integer>(n);

        ArrayList<Integer> queue = new ArrayList<Integer>(n);
        queue.add(source);

        Iterator<Integer> itr = queue.iterator();
        int j=0;
        while(itr.hasNext())
        {
            if(queue.contains(source) == false)
            {
                queue.add(source);
            }
            for(int i=0;i<adj_list[source].size(); i++)
            {
                if((queue.contains(adj_list[source].get(i)) == false)  ||  visited[adj_list[source].get(i)] == false)
                {
                    queue.add(adj_list[source].get(i));
                }
            }
            visited[queue.get(0)] = true;
            traversal.add(queue.get(0));
           // System.out.print(traversal.get(0) + "   ");
            queue.remove(0);
            if(queue.size() > 0)
            {
            source = queue.get(0);
            //System.out.print(source + " ");
            }
            else
            break;
            //System.out.print(queue.get(0) + "   ");
            //System.out.print(".yyyyy");
        }
        //System.out.print("./////");
        //System.out.print(traversal.get(0) + "   ");
        return traversal;
    }
}


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of vertices in the graph: ");
        int n = sc.nextInt();

        Graph graph = new Graph(n);
        graph.add_edge(3,0);
        graph.add_edge(0,1);
        graph.add_edge(0,2);
        graph.add_edge(3,4);
        //graph.add_edge(0,4);

        ArrayList<Integer> traversal_route = graph.BFS(3,graph.adj_list);
        System.out.println();
        System.out.print("The traversal route of the graph using BFS is: ");
        System.out.print("......");
        for(int i=0;i<traversal_route.size();i++)
        {
            System.out.print(traversal_route.get(i) + " ");
        }


    }
}
/* OUTPUT 
----------*/
/* Enter the no. of vertices in the graph: 5
The traversal route of the graph using BFS is: ......3 0 4 1 2 */ 