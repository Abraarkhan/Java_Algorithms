import java.util.*;

public class DisjointSetUnion {
    
    int[] parent;
    int[] rank;
    
    DisjointSetUnion(int n)
    {
        parent=new int[n];
        rank=new int[n];
        
        for(int i=0;i<n;i++)
            parent[i] = i;
        
        Arrays.fill(rank,1);
    }
    
    public int find(int x)
      {
          if(parent[x]==x) return x;
          
          int temp=find(parent[x]);
          parent[x]=temp;
          return temp;
      }
  
    public boolean union(int x,int y)
      {
          int px=find(x);
          int py=find(y);
          
          if(px!=py)
          {
              if(rank[px]>rank[py])
                parent[py]=px;
              else if(rank[px]<rank[py])
                parent[px]=py;
              else
              {
                  parent[px]=py;
                  rank[py]++;
              }
              
              return true;
          }
          
          return false;
      }
    
    public int[] getMaxSize()
    {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        
        for(int i=0;i<parent.length;i++)
        {
            int ele = find(i);
            map.put(ele,map.getOrDefault(ele,0)+1);
            
            max = Math.max(max,map.get(ele));
        }
        
        return new int[]{map.size(),max};
    }
}
