import java.util.*;
import java.io.*;
/**
 * Main
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{


        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[2][3];
        int temp[][] = new int[2][3];
        for(int i = 0; i<N; i++){

            String str1[] = br.readLine().split(" ");
            int a = Integer.parseInt(str1[0]);
            int b = Integer.parseInt(str1[1]);
            int c = Integer.parseInt(str1[2]);
            

            temp[0][0] = max(dp[0][0] + a, dp[0][1] + a);
            temp[0][1] = max(dp[0][0] + b, max(dp[0][1] + b, dp[0][2] + b));
            temp[0][2] = max(dp[0][2] + c, dp[0][1] + c);

            dp[0] = temp[0].clone();

            temp[1][0] = min(dp[1][0] + a, dp[1][1] + a);
            temp[1][1] = min(dp[1][0] + b, min(dp[1][1] + b, dp[1][2] + b));
            temp[1][2] = min(dp[1][2] + c, dp[1][1] + c);

            dp[1] = temp[1].clone();
        }

        bw.write(max(dp[0][0], max(dp[0][1], dp[0][2])) + " " + min(dp[1][0], min(dp[1][1], dp[1][2])));
        bw.flush();
    } 
    private static int max(int a, int b){
        if(a > b)
            return a;
        return b;
    }
    private static int min(int a, int b){
        if(a > b)
            return b;
        return a;
    }
}