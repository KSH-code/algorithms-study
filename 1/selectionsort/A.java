import java.util.Scanner;
import java.util.Arrays;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a = Integer.parseInt(sc.nextLine());
        String sA[]=sc.nextLine().split(" ");
        int A[]=new int[a];
        String sB[]=sc.nextLine().split(" ");        
        int B[]=new int[a];
        
        for(int i=0;i<a;i++){
            A[i]=Integer.parseInt(sA[i]);
        }
        for(int i=0;i<a;i++){
            B[i]=Integer.parseInt(sB[i]);
        }
        Sort(false,A);
        Sort(true,B);
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=A[i]*B[i];
        }
        System.out.println(sum);
    }
    private static void Sort(boolean ASC,int arr[]){
        if(ASC){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }else{
            for(int i=0;i<arr.length-1;i++){
                for(int j=i;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
    }
}