import java.util.Scanner;

public class magnets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=1;
        int[] arr=new int[n];
        for(int in=0;in<n;in++){
            arr[in]=sc.nextInt();
        }
        for(int in=0;in<n-1;in++){
            if(arr[in]!=arr[in+1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
