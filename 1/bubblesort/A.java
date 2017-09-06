import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine().trim());//N

        int a[]=new int[length];//N만큼 배열 생성
        String s=sc.nextLine().trim();//배열
        String ss[]=s.split(" ");//배열
        for(int i=0;i<length;i++){
            a[i]=Integer.parseInt(ss[i]);//배열 집어넣기
        }
        int lengthh=Integer.parseInt(sc.nextLine().trim());//K
        int aa[];
        StringBuilder print=new StringBuilder();
        for(int i=0;i<lengthh;i++){
            aa=a.clone();
            String aaaa[]=sc.nextLine().trim().split(" ");
            int abcd=Integer.parseInt(aaaa[0]),efgh=Integer.parseInt(aaaa[1]);// A B
            for(int j=0;j<abcd-1;j++){
                for(int k=j+1;k<abcd;k++){
                    if(aa[j]>aa[k]){
                        int temp=aa[j];
                        aa[j]=aa[k];
                        aa[k]=temp;
                    }
                }
            }
            for(int j=0;j<efgh-1;j++){
                for(int k=j+1;k<efgh;k++){
                    if(aa[j]<aa[k]){
                        int temp=aa[j];
                        aa[j]=aa[k];
                        aa[k]=temp;
                    }
                }
            }
            for(int abcdf : aa){
                print.append(abcdf);print.append(" ");
            }
            print.append("\n");
        }
        System.out.println(print.toString());
    }
}