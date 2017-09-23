
import java.util.*;
import java.io.*;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String str1 = br.readLine();
      String str2 = br.readLine();
      int lb = str2.length(), la = str1.length();
      int d[][] = new int[la + 1][lb + 1];
      for (int i = 1; i <= la; i++) {
         d[i][0] = i;
      }
      for (int j = 1; j <= lb; j++) {
         d[0][j] = j;
      }

      for (int i = 1; i <= la; i++) {
         for (int j = 1; j <= lb; j++) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
               d[i][j] = d[i - 1][j - 1];
            } else {
               d[i][j] = Math.min(Math.min(d[i - 1][j], d[i][j - 1]), d[i - 1][j - 1]) + 1;
            }
         }
      }
      int s;
      int i=0,j=0;
      while (i+1<=la&&j+1<=lb) {
          s=Math.min(d[i+1][j+1],Math.min(d[i+1][j],d[i][j+1]));
        if (d[i][j] == s) {
            bw.write("c " + str1.charAt(i));
            i++;
            j++;
        } else if (d[i][j+1] == s) {
            bw.write("a " + str2.charAt(j));
            j++;
        } else if (d[i+1][j+1] == s) {
            bw.write("m " + str2.charAt(j));
            i++;
            j++;
        } else {
            bw.write("d " + str2.charAt(i));
            i++;
        }
        bw.write("\n");
      }
      bw.flush();
   }

}