import java.util.*;
import java.io.*;

/**
 * Main
 */
public class Main {
    private static char mTree[][];
    private static int mN;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        mN = Integer.parseInt(br.readLine());

        mTree = new char[mN + 1][mN + 1];

        for (int i = 1; i <= mN; i++) {
            
            String inputLine = br.readLine();
            for (int j = 0; j < mN; j++) {
                mTree[i][j + 1] = inputLine.charAt(j);
            }
        }
        quadTree(1, 1, 1);        
        bw.flush();
    }

    private static void quadTree(int row, int col, int count) throws IOException{
        if(count > mN)
            return;
        char check = mTree[row][col];
        
        for(int i = row;i<=row + mN / count - 1;i++){
            for(int j = col;j<=col + mN / count - 1;j++){
                if(check != mTree[i][j]){
                    count *= 2;
                    bw.write("(");
                    quadTree(row, col, count); // LT
                    quadTree(row, col + mN / count, count); // RT
                    quadTree(row + mN / count, col, count); // LB
                    quadTree(row + mN / count, col + mN / count, count); // RB
                    bw.write(")");
                    return;
                }
            }
        }
        bw.write(check);
    }
}