import java.io.*;
import java.util.*;

class Main {
    private static int memo[] = new int[1001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = box(N);

        bw.write(result+""); 
        bw.flush();
    }
    private static int box(int n){//Top-down
        if(n<=2){
            return n;
        }
        if(memo[n]>0){
            return memo[n];
        }
        return memo[n] = (box(n-2)+box(n-1))%10007;
    }
}
