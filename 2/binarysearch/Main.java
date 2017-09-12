import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int A[]= new int[N];
        String a[]=br.readLine().split(" ");

        for(int i=0;i<N;i++){//대입
            A[i]=Integer.parseInt(a[i]);
        }

        int M = Integer.parseInt(br.readLine());

        int B[]= new int[M];
        String b[]=br.readLine().split(" ");

        for(int i=0;i<M;i++){//대입
            B[i]=Integer.parseInt(b[i]);
        }
        
        Arrays.sort(A);
        int temp;
        for(int i=0;i<M;i++){
            temp = Arrays.binarySearch(A, B[i]);

            // if(binarySearch(A, B[i],0,M-1)){
             if(temp<0||A[temp]!=B[i]){
                bw.write("0");
            }else{
                bw.write("1");
            }
            bw.write("\n");
        }
        bw.flush();   
    }

    private static boolean binarySearch(int arr[],int value,int l,int r){
        if(r<l){
            return false;
        }else{
            int mid = (l+r)/2;
            if(arr[mid]==value)
                return true;
            else if(arr[mid]>value)
                return binarySearch(arr, value, l, mid-1);
            else
                return binarySearch(arr, value, mid+1, r);
        }
    }
}
