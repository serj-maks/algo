package org.serjmaks.algo.legacy;

import java.util.*;

public class AccountsMerge {
    public static List<List<String>> run(List<List<String>> accounts) {
        // <email node, neighbor nodes>
        Map<String, Set<String>> graph = new HashMap<>();

        // <email, username>
        Map<String, String> owner = new HashMap<>();

        Set<String> visited = new HashSet<>();
        List<List<String>> results = new ArrayList<>();

        // build the graph
        for (List<String> account : accounts) {
            String userName = account.get(0);
            Set<String> neighbors = new HashSet<>(account);

            /*
            when neighbors Set is created, userName is also included here -> new HashSet<>(account).
            So the userName is removed as it is not needed in the Set
             */
            neighbors.remove(userName);

            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                if (!graph.containsKey(email)) {
                    graph.put(email, new HashSet<>());
                }
                graph.get(email).addAll(neighbors);
                owner.put(email, userName);
            }
        }

        // dfs search the graph
        for (String email : owner.keySet()) {
            if (!visited.contains(email)) {
                List<String> result = new ArrayList<>();
                dfs(graph, email, visited, result);
                Collections.sort(result);
                result.add(0, owner.get(email));
                results.add(result);
            }
        }
        
        return results;

    }

    private static void dfs(Map<String, Set<String>> graph, String email, Set<String> visited, List<String> list) {
        list.add(email);
        visited.add(email);
        for (String neighbor : graph.get(email)) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited, list);
            }
        }
    }
}
