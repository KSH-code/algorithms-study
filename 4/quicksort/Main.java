import java.util.*;
import java.io.*;
/**
 * Main
 */
public class Main {

    private static long arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1[];

        int N = Integer.parseInt(br.readLine());

        arr = new long[N];

        long x,y;
        for(int i = 0;i<N;i++){
            str1 = br.readLine().split(" ");
            x = (Long.parseLong(str1[0]) + 100000) * 1000000;
            y = Long.parseLong(str1[1]) + 100000;
            arr[i] = x+y;
        }

        quickSort(0, N-1);

        long temp;
        for(int i = 0;i<N;i++){
            temp = arr[i];
            bw.write(String.valueOf(temp / 1000000 - 100000) + " " + String.valueOf(temp % 1000000 - 100000));
            bw.write("\n");
        }

        bw.flush();
    }   
    private static void quickSort(long left, long right) {
        long pivot;
        long left_temp, right_temp;
        left_temp = left;
        right_temp = right;
        pivot = arr[(int)left];
        while (left < right) {
            while (arr[(int)right] >= pivot && (left < right)) {
                right--;
            }
            if (left != right) {
                arr[(int)left] = arr[(int)right];
            }
            while (arr[(int)left] <= pivot && (left < right)) {
                left++;
            }
            if (left != right) {
                arr[(int)right] = arr[(int)left];
                right--;
            }
        }
        arr[(int)left] = pivot;
        pivot = left;
        left = left_temp;
        right = right_temp;
        if (left < pivot) quickSort(left, pivot - 1);
        if (right > pivot) quickSort(pivot + 1, right);
    }
}