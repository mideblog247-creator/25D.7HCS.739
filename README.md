IMPLEMENTATION OF UNINFORMED SEARCH STRATEGIES IN ARTIFICIAL INTELLIGENCE USING JAVA

1. Introduction

Artificial Intelligence (AI) uses search strategies to find solutions to problems by exploring possible states or nodes. This assignment explains six uninformed search techniques and their implementation using Java.

The search techniques are:

1. Breadth-First Search (BFS)
2. Depth-First Search (DFS)
3. Uniform-Cost Search (UCS)
4. Depth-Limited Search (DLS)
5. Iterative Deepening Depth-First Search (IDDFS)
6. Bidirectional Search

2. Given Search Tree

The search tree has the following structure:

- A connects to B and C.
- B connects to D and E.
- C connects to F and G.
- D connects to H and I.
- E connects to J and K.
- G connects to L.

Starting node: A
Goal node: I
Depth limit: 3

The solution path is:

A → B → D → I

The root node A is at depth 0. Nodes B and C are at depth 1. Nodes D, E, F and G are at depth 2. Nodes H, I, J, K and L are at depth 3.

3. Breadth-First Search (BFS)

BFS explores nodes level by level using a queue. It finds the shortest path in an unweighted graph.

Algorithm:

1. Add the starting node to a queue.
2. Remove the first node from the queue.
3. If it is the goal, return the solution.
4. Add its unvisited children to the queue.
5. Repeat until the goal is found or the queue becomes empty.

Expected path: A → B → D → I.

4. Depth-First Search (DFS)

DFS explores one branch as deeply as possible before backtracking. It uses a stack or recursion.

Algorithm:

1. Start at the root node.
2. Visit the current node.
3. If it is the goal, stop.
4. Otherwise, explore an unvisited child.
5. Backtrack when no unexplored children remain.

Expected path: A → B → D → I, when children are explored from left to right.

5. Uniform-Cost Search (UCS)

UCS expands the node with the lowest accumulated path cost. It uses a priority queue.

Algorithm:

1. Set the starting node's cost to zero.
2. Insert the start into a priority queue.
3. Remove the node with the lowest cost.
4. If it is the goal, return the path and cost.
5. Update the costs of neighbouring nodes when a cheaper path is found.
6. Repeat until the goal is found or no nodes remain.

Note: The supplied tree has no edge costs, so a separate weighted graph is required to demonstrate UCS.

6. Depth-Limited Search (DLS)

DLS is a form of DFS that does not explore beyond a specified depth.

Algorithm:

1. Start at A with depth zero.
2. Check whether the current node is the goal.
3. If the depth limit is reached, stop exploring that branch.
4. Otherwise, explore the children recursively.
5. Stop when the goal is found or all permitted paths have been explored.

With a depth limit of 3, the goal I can be found along A → B → D → I.

7. Iterative Deepening Depth-First Search (IDDFS)

IDDFS repeatedly performs depth-limited search, increasing the limit after each unsuccessful attempt.

Algorithm:

1. Set the depth limit to zero.
2. Perform depth-limited search.
3. If the goal is not found, increase the limit by one.
4. Repeat until the goal is found.

For this tree, the goal is found at depth limit 3.

8. Bidirectional Search

Bidirectional Search searches forward from the start and backward from the goal until the searches meet.

Algorithm:

1. Begin one search at A and another at I.
2. Expand the frontier of each search.
3. Record the parent of each discovered node.
4. Stop when the two searches meet.
5. Join the partial paths to produce the solution.

This method requires backward traversal to be possible. For a directed graph, the reverse edges must be known or available.

Expected path: A → B → D → I.

9. Comparison of Search Techniques

Technique| Data Structure| Main Feature
BFS| Queue| Explores level by level
DFS| Stack| Explores deeply before backtracking
UCS| Priority queue| Expands the lowest-cost path
DLS| Stack or recursion| Enforces a depth limit
IDDFS| Repeated depth-limited search| Increases the depth limit gradually
Bidirectional Search| Two queues| Searches from both ends

10. Conclusion

Uninformed search techniques are important in Artificial Intelligence because they explore a search space without using heuristic estimates. Each technique has its own strengths and limitations. For the given search tree, the goal node I is reached from the starting node A through B and D, at depth 3.

11. Java Source Code

The Java implementations for all six techniques should be uploaded as separate source files in this repository.
