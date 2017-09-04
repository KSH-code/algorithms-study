import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = Integer.parseInt(s.split(" ")[0]);
        int b = Integer.parseInt(s.split(" ")[1]);
        int arr[] = new int[b-a+1];
        for(int i=0;i+a<=b;i++){
            arr[i]=a+i;
        }
        for(int i=0;i+a<=b;i++){
            double n = Math.sqrt(arr[i]);
            for(int j=2;j<=n;j++){
                if(arr[i]%j==0){
                    arr[i]=0;
                }
            }
        }
        for(int i=0;i+a<=b;i++){
            if(arr[i]>1){
                System.out.println(arr[i]);
            }
        }
    }
}