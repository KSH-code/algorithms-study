import java.io.*;
import java.util.*;



class Main {
    private static boolean mGraph[][];
    private static int N,M;
    private static int mMin = Integer.MAX_VALUE;
    private static int mCheck = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1[] = br.readLine().split(" ");
        N = Integer.parseInt(str1[0]);
        M = Integer.parseInt(str1[1]);
        String str2;
        mGraph=new boolean[N+1][M+1];
        for(int i = 1;i<=N;i++){
            str2=br.readLine();
            for(int j = 1;j<=M;j++){
                mGraph[i][j]=str2.charAt(j-1)=='1';
            }
        }
        DFS(1,1,0,mGraph);
        System.out.println(mMin);
    }
    private static void DFS(int x,int y,int result,boolean a[][]){
        result++;
        a[x][y]=false;
        boolean temp[][] = new boolean[N+1][M+1];
        for(int i=1;i<=N;i++){
            temp[i]=a[i].clone();
        }
        if(x+1<=N&&temp[x+1][y]){
            DFS(x+1, y, result,temp);
        }
        if(y+1<=M&&temp[x][y+1]){
            DFS(x, y+1, result,temp);
        }
        if(x-1>=1&&temp[x-1][y]){
            DFS(x-1, y, result,temp);
        }
        if(y-1>=1&&temp[x][y-1]){
            DFS(x, y-1, result,temp);
        }
        if(x==N&&y==M){
            if(mMin>result)
                mMin=result;
        }
    }
}
