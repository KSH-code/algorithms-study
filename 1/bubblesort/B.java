import java.util.Scanner;
import java.io.*;
class B{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Sort(arr);
        for(int i=0;i<N;i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
    }
    private static void Sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    // public static void main(String args[]) throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //     int N = Integer.parseInt(br.readLine());
    //     int arr[]=new int[2000001];
    //     for(int i=0;i<N;i++){
    //         ++arr[Integer.parseInt(br.readLine())+1000000];
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>0)
    //             bw.write((i-1000000)+"\n");
    //     }
    //     bw.flush();
    // }
}