import java.util.*;

public class good_kid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int jn=1;jn<=test;jn++){
            int num=sc.nextInt();
            int[] arr=new int[num];
            for(int in=0;in<num;in++){
                arr[in]=sc.nextInt();
            }
            System.out.println(find_present(arr));
        }
    }
    public static int find_present(int[] arr){
        Arrays.sort(arr);
        arr[0]=arr[0]+1;
        int pro=1;
        for(int in=0;in<arr.length;in++){
            pro=pro*arr[in];
        }
        return pro;
    }
}
