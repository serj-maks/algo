package org.serjmaks.algo.legacy.clone_graph;

import java.util.Arrays;

public class CloneGraph {
    public static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Node copy = new Node(node.val);
        Node[] visited = new Node[101];
        Arrays.fill(visited, null);
        dfs(node, copy, visited);
        return copy;
    }

    private static void dfs(Node node, Node copy, Node[] visited) {
        visited[copy.val] = copy;

        for (Node n : node.neighbors) {
            if (visited[n.val] == null) {
                Node newNode = new Node(n.val);
                copy.neighbors.add(newNode);
                dfs(n, newNode, visited);
            } else {
                copy.neighbors.add(visited[n.val]);
            }
        }
    }
}
