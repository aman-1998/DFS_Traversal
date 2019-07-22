import java.util.*;
import java.lang.*;

class dfs
{
	int[][] G=new int[20][20];
	int[] visited=new int[20];
	void DFT(int n,int v)
	{
		int i;
		for(i=1;i<=n;i++)
			visited[i]=0;
		DFS(n,v);
		for(i=1;i<=n;i++)
		{
			if(visited[i]==0)
				DFS(n,i);
		}
	}
	void DFS(int n,int v)
	{
		int u,i;
		u=v;
		visited[u]=1;
		System.out.print(u+" ");
		for(i=1;i<=n;i++)
		{
			if(G[u][i]==1 && visited[i]==0)
				DFS(n,i);
		}
	}
	public static void main(String args[])
	{
		int i,j;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no. of vertices: ");
		int n=in.nextInt();
		dfs x=new dfs();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("Enter G["+i+"]["+j+"] : ");
				x.G[i][j]=in.nextInt();
				if(x.G[i][j]!=0 && x.G[i][j]!=1)
				{
					System.out.println("Invalid Input");
					j--;
				}
			}
		}
		System.out.print("\nAdjacency Matrix: ");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(x.G[i][j]+" ");
			System.out.println();
		}
		System.out.print("Enter the vertex from where you want to start: ");
		int v=in.nextInt();
		System.out.println("DFS:- ");
		x.DFT(n,v);
	}
}