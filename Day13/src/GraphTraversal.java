import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphTraversal {

	public static void bfs(List<List<Integer>> graph, int v) {
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(i);
				visited[i] = true;

				while (!q.isEmpty()) {
					int element = q.remove();
					System.out.println(element);

					for (int next : graph.get(element)) {
						if (!visited[next]) {
							q.add(next);
							visited[next] = true;
						}
					}
				}
			}

		}
	}

	public static void dfs(List<List<Integer>> graph, int v) {
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				Stack<Integer> st = new Stack<Integer>();
				st.push(i);
				visited[i] = true;

				while (!st.isEmpty()) {
					int element = st.pop();
					System.out.println(element);

					for (int next : graph.get(element)) {
						if (!visited[next]) {
							st.push(next);
							visited[next] = true;
						}
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nodes: ");
		int v = sc.nextInt();

		System.out.println("Edges: ");
		int e = sc.nextInt();

		List<List<Integer>> graph = new ArrayList<>();

		for (int i = 0; i < v; i++)
			graph.add(new ArrayList<Integer>());

		for (int i = 0; i < e; i++) {
			graph.get(sc.nextInt()).add(sc.nextInt());
		}
		System.out.println(graph);
		dfs(graph, v);
	}

}
