import java.util.*;
import java.io.*;
import java.util.LinkedList;
class A{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int P=Integer.parseInt(br.readLine().trim());
        int a[]=new int[1000];
        LinkedList<Integer> nn=new LinkedList<>();
        for(int p=0;p<P;p++){
            int N = Integer.parseInt(br.readLine().trim().split(" ")[1]);
            for(int t=0;t<=N/10;t++){
                String n[]=br.readLine().trim().split(" ");
                for(int i = 0;i<n.length;i++){
                    boolean check = false;
                    int temp = Integer.parseInt(n[i]);
                    for(int j = 0;j<nn.size();j++){
                        if(temp < nn.get(j)){
                            nn.add(temp);
                            Collections.sort(nn);
                            a[p]++;
                            check = true;
                            break;
                        }
                    }
                    if(!check){
                        nn.add(temp);
                    }
                }
            }
            nn.clear();
        }
        for(int p=0;p<P;p++){
            bw.append((p+1)+" "+a[p]);
            bw.append("\n");
        }
        bw.flush();
    }
    // public static void main(String[] args) throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //     int P=Integer.parseInt(br.readLine().trim());
    //     int a[]=new int[100];
    //     LinkedList<Integer> nn=new LinkedList<Integer>();
    //     for(int p=0;p<P;p++){
    //         int N = Integer.parseInt(br.readLine().trim().split(" ")[1]);
    //         int nnn[] = new int[N];
    //         int absadf=0;
    //         for(int t=0;t<=N/10;t++){
    //             String n[]=br.readLine().trim().split(" ");
    //             for(int i = 0;i<n.length;i++){
    //                 int temp = Integer.parseInt(n[i]);
    //                 nnn[absadf++]=temp;
    //             }
    //         }
    //         a[p]=quickSort(nnn,0,N-1);
    //         a[p]--;
    //         if(a[p]==2){
    //             a[p]--;
    //         }
    //     }
    //     for(int p=0;p<P;p++){
    //         bw.append((p+1)+" "+a[p]);
    //         bw.append("\n");
    //     }
    //     bw.flush();
    // }
    // public static int quickSort(int[] arr, int left, int right) {
    //     int i, j, pivot, tmp;
    //     if (left < right) {
    //         i = left;
    //         j = right;
    //         pivot = arr[left];
    //         //분할 과정
    //         while (i < j) {
    //             while (arr[j] > pivot) j--;
    //             // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함
    //             while (i < j && arr[i] <= pivot) i++;

    //             tmp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = tmp;
    //         }
    //         arr[left] = arr[i];
    //         arr[i] = pivot;
    //         //정렬 과정
    //         return quickSort(arr, left, i - 1)+quickSort(arr, i + 1, right);
    //     } else {
    //         return 1;
    //     }
    // }
}