// V - total vertices
     // visited - boolean array to keep track of visited nodes
     // graph - adjacency list.
    // Main Topological Sort Function. 
    void topologicalSort() 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
  
        // Mark all the vertices as not visited 
        boolean visited[] = new boolean[V]; 
        for (int j = 0; j < V; j++){ 
            visited[j] = false; 
        }
        // Call the util function starting from all vertices one by one 
        for (int i = 0; i < V; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, stack); 
  
        // Print contents of stack -> result of topological sort
        while (stack.empty() == false) 
            System.out.print(stack.pop() + " "); 
    } 
    
    // A helper function used by topologicalSort
    void topologicalSortUtil(int v, boolean visited[], 
                             Stack<Integer> stack) 
    { 
        // Mark the current node as visited. 
        visited[v] = true; 
        Integer i; 
  
        // Recur for all the vertices adjacent to the current vertex 
        Iterator<Integer> it = graph.get(v).iterator(); 
        while (it.hasNext()) { 
            i = it.next(); 
            if (!visited[i]) 
                topologicalSortUtil(i, visited, stack); 
        } 
  
        // Push current vertex to stack that saves result 
        stack.push(new Integer(v)); 
    } 
