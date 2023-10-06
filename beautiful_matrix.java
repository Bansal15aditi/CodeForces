import java.util.Scanner;

public class beautiful_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int x=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                x=sc.nextInt();
                if(x==1){
                    System.out.println(Math.abs(i-3)+Math.abs(j-3));
                }
            }
        }
    }
}
