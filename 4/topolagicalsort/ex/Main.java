import java.util.*;

public class Main {
    static int n;
    static int m;
    static int s;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        ArrayList<Integer>[] adj_list = new ArrayList[n + 1]; // 인접(adjacency)한 점을 담을 리스트

        for (int i = 1; i <= n; i++) {
            adj_list[i] = new ArrayList<>();
        }

        int ind[] = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj_list[u].add(v); // u(시작 정점) -> v(도착 정점)로 간다.
            ind[v]++; // v 랑 연결된 점의 개수
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (ind[i] == 0) { // 도착정점이 아니면
                q.add(i); // 큐에 담는다.
            }
        }
        while (!q.isEmpty()) { // 큐가 비어있지 않으면
            int here = q.poll(); // 큐에서고꺼내고 지금 위치로 저장한다.
            System.out.print(String.valueOf(here) + ' '); // 지금 위치를 출력하고 
            for (int i = 0; i < adj_list[here].size(); i++) { // 인접한 점 즉, u -> here 에서 u를 찾아낸다.
                int there = adj_list[here].get(i); // u가 있으면, 
                ind[there]--;// u랑 연결된 점의 개수를 1개 빼주고
                if (ind[there] == 0) { // u랑 연결된 점의 개수가 0일시
                    q.add(there); // 큐에 u를 담는다.
                }
            }
        }
    }
}