DFS_Traversal

Depth first search (DFS) algorithm starts with the initial node of the graph G, and 
then goes to deeper and deeper until we find the goal node or the node which has no 
children. The algorithm, then backtracks from the dead end towards the most recent 
node that is yet to be completely unexplored.

The data structure which is being used in DFS is stack. The process is similar to 
BFS algorithm. In DFS, the edges that leads to an unvisited node are called 
discovery edges while the edges that leads to an already visited node are called 
block edges.
