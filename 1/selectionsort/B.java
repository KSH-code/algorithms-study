import java.util.Scanner;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
class B{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(sc.nextLine().trim());
        }
        Sort(true,arr);
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }
    }
    private static void Sort(boolean ASC,int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    // public static void main(String args[]) throws IOException{
    //     Scanner sc=new Scanner(System.in);
    //     int N=sc.nextInt();
    //     int arr[]=new int[10001];
    //     for(int i=0;i<N;i++){
    //         arr[sc.nextInt()]++;
    //     }
    //     OutputStream os = new BufferedOutputStream(System.out);
    //     for (int i = 1; i <= 10000; i++) {
    //         for (int j = 0; j < arr[i]; j++) {
    //             os.write((i + "\n").getBytes());
    //         }
    //     }
    //     os.flush();
    // }
}