import java.util.*;

public class Graph {
  private Map<String, List<Edge>> adjacencyList;

  public Graph() {
    this.adjacencyList = new HashMap<>();
  }

  public String addVertex(String value) {
    if (!adjacencyList.containsKey(value)) {
      adjacencyList.put(value, new ArrayList<>());
    }
    return value;
  }

  public void addEdge(String vertex1, String vertex2, int weight) {
    if (!adjacencyList.containsKey(vertex1) || !adjacencyList.containsKey(vertex2)) {
      throw new IllegalArgumentException("Both vertices must be in the graph.");
    }
    adjacencyList.get(vertex1).add(new Edge(vertex2, weight));
    adjacencyList.get(vertex2).add(new Edge(vertex1, weight));
  }

  public Set<String> getVertices() {
    return adjacencyList.keySet();
  }

  public List<Edge> getNeighbors(String vertex) {
    if (!adjacencyList.containsKey(vertex)) {
      throw new IllegalArgumentException("The vertex does not exist.");
    }
    return adjacencyList.get(vertex);
  }

  public int size() {
    return adjacencyList.size();
  }

  public static class Edge {
    String vertex;
    int weight;

    public Edge(String vertex, int weight) {
      this.vertex = vertex;
      this.weight = weight;
    }

    public String getVertex() {
      return vertex;
    }

    public int getWeight() {
      return weight;
    }
  }
}

//ChatGPT help
