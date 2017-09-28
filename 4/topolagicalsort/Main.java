import java.util.*;
import java.io.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1[] = br.readLine().split(" ");

        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);

        ArrayList<Integer>[] adj_list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj_list[i] = new ArrayList<>();
        }
        int ind[] = new int[N + 1];
        String str2[];
        for (int i = 0; i < M; i++) {
            str2 = br.readLine().split(" ");
            int u = Integer.parseInt(str2[0]);
            int v = Integer.parseInt(str2[1]);
            adj_list[u].add(v);
            ind[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int here = q.remove();
            bw.write(String.valueOf(here) + ' ');
            for (int i = 0; i < adj_list[here].size(); i++) {
                int there = adj_list[here].get(i);
                ind[there]--;
                if (ind[there] == 0) {
                    q.add(there);
                }
            }
        }

        bw.flush();
    } 
}