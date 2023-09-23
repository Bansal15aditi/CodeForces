import java.util.*;

public class vanya_fence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(print_space(arr,h));
    }
    public static int print_space(int[] arr,int h){
        int sum=0;
        for(int in=0;in<arr.length;in++){
            if(arr[in]<=h){
                sum+=1;
            }
            else{
                sum+=2;
            }
        }
        return sum;
    }
}
