import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1[] = br.readLine().split(" ");

        
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);
        int dy[][] = new int[K][N];
        for(int j = 0;j<N;j++){
            dy[0][j] = 1;
        }
        for(int i = 1;i<K;i++){
            dy[i][0] = i+1;
        }
        for(int i = 1;i<K;i++){
            for(int j = 1;j<N;j++){
                dy[i][j] = (dy[i][j-1]+dy[i-1][j])%1000000000;
            }
        }
        bw.write(String.valueOf(dy[K-1][N-1]));
        bw.flush();
    }
}
