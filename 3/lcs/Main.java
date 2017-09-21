import java.util.Arrays;
import java.io.*;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = " " + br.readLine();
        String str2 = " " + br.readLine();
        char A[] = str1.toCharArray();
        char B[] = str2.toCharArray();
        int lcs[][] = new int[B.length][A.length];

        for (int i = 1; i < B.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j] == B[i]) {
                    lcs[i][j]=lcs[i-1][j-1]+1;
                } else {
                    lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
        }
        int x=B.length-1,y=A.length-1;
        int temp=lcs[B.length - 1][A.length - 1];
        StringBuffer result = new StringBuffer();
        while(x>0&&y>0){
            if(lcs[x-1][y-1]!=temp){
                result.append(A[y]);
                x--;
                temp--;
                y--;
            }else{
                if(y > 0 && (x == 0 || lcs[x][y-1] >= lcs[x-1][y]))
                    y--;
                else
                    x--;
            }
        }
        result=result.reverse();
        System.out.println(lcs[B.length - 1][A.length - 1]);
        System.out.println(result.toString());
   }

}