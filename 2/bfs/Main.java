import java.io.*;
import java.util.*;

class Main {
    private static BufferedWriter bw;
    private static int N,M;
    private static boolean mEdges1[][],mEdges2[][];
    private static boolean mVisited1[], mVisited2[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");

        N = Integer.parseInt(str1[0]);
        M = Integer.parseInt(str1[1]);
        int V = Integer.parseInt(str1[2]);

        mEdges1 = new boolean[N+1][N+1];
        mEdges2 = new boolean[N+1][N+1];
        mVisited1 = new boolean[N+1];
        mVisited2 = new boolean[N+1];
        int from, to;
        String str2[];
        for(int i = 1; i <= M; i++){
            str2 = br.readLine().split(" ");
            from = Integer.parseInt(str2[0]);
            to = Integer.parseInt(str2[1]);
            mEdges1[from][to] = true;
            mEdges2[from][to] = true;
            mEdges1[to][from] = true;
            mEdges2[to][from] = true;
        }
        DFS(V);
        bw.write("\n");
        BFS(V);
        bw.flush();   
    }
    private static void DFS(int from) throws IOException{
        mVisited1[from]=true;
        bw.write(from + " ");
        for(int to=1;to<=N;to++){
            if(mVisited1[to]||!mEdges1[from][to])
                continue;
            DFS(to);
        }
    }
    private static void BFS(int cur) throws IOException{
        Queue<Integer> queue = new LinkedList<>();
        queue.add(cur);
        mVisited2[cur]=true;
        while(!queue.isEmpty()){ // 큐 size > 0
            int from = queue.poll();
            bw.write(from + " ");
            for(int to=1;to<=N;to++){
                if(mVisited2[to]||!mEdges2[from][to])
                    continue;
                queue.add(to);
                mVisited2[to]=true;
            }
        }
    }
}
