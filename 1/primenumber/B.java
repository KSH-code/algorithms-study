import java.util.*;
import java.io.*;
class B{
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=2;i<996;i++){
            boolean a=false;
            double b = Math.sqrt(i);
            for(int j=2;j<=b;j++){
                if(i%j==0){
                    a=true;
                }
            }
            if(!a){
                l.add(i);
            }
        }
        for(int i=0;i<T;i++){
            boolean a=true;
            int check=Integer.parseInt(br.readLine());
            abcd:
            for(int o : l){
                for(int oo:l){
                    for(int ooo:l){
                        if(o+oo+ooo==check){
                            a=false;
                            bw.write(o+" "+oo+" "+ooo);
                            break abcd;
                        }
                    }
                }
            }
            if(a){
                bw.write("0");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}