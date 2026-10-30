import java.util.*;

public class BFS {

public static void main(String[] args) {

    Map<String, List<String>> graph = new LinkedHashMap<>();

    graph.put("A", Arrays.asList("B", "C"));
    graph.put("B", Arrays.asList("D", "E"));
    graph.put("C", Arrays.asList("F", "G"));
    graph.put("D", Arrays.asList("H", "I"));
    graph.put("E", Arrays.asList("J", "K"));
    graph.put("F", Collections.emptyList());
    graph.put("G", Arrays.asList("L"));
    graph.put("H", Collections.emptyList());
    graph.put("I", Collections.emptyList());
    graph.put("J", Collections.emptyList());
    graph.put("K", Collections.emptyList());
    graph.put("L", Collections.emptyList());

    Queue<String> queue = new LinkedList<>();
    Map<String, String> parent = new HashMap<>();
    Set<String> visited = new HashSet<>();

    queue.add("A");
    visited.add("A");
    parent.put("A", null);

    while (!queue.isEmpty()) {

        String current = queue.remove();

        if (current.equals("I")) {
            List<String> path = new ArrayList<>();

            while (current != null) {
                path.add(current);
                current = parent.get(current);
            }

            Collections.reverse(path);

            System.out.println("Goal found!");
            System.out.println("Path: " + path);
            return;
        }

        for (String child :
                graph.getOrDefault(current, Collections.emptyList())) {

            if (!visited.contains(child)) {
                visited.add(child);
                parent.put(child, current);
                queue.add(child);
            }
        }
    }

    System.out.println("Goal not found.");
}

}
