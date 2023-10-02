import java.util.*;

public class next_round {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int target=sc.nextInt();
        Integer[] arr=new Integer[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        int cnt=0;
            for(int jn=0;jn<num;jn++){
                if((arr[jn]>=arr[target-1])&& arr[jn]>0){
                    cnt++;
                }
            }
        // }
        System.out.println(cnt);
    }
}
