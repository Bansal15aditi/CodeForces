import java.util.Scanner;

public class baer_big_bro {
    public static void main(String[] srgs){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a==b){
            System.out.println(1);
            return ;
        }
        int qu=b/a;
        int rem=b%a;
        int ans=0;
        if(qu%2!=0 && rem%2!=0){
            ans=Math.abs(qu-rem);
            System.out.println(ans);
        }
        else if(qu%2==0 && rem%2!=0){
            ans=qu+rem;
            System.out.println(ans);
        }
        else if(qu%2!=0 && rem%2!=0 && qu==rem){
            ans=qu;
            System.out.println(ans);
        }
        else if(qu%2==0 && rem%2==0 && qu==rem ||(qu%2!=0 && rem%2==0)){
            ans=(qu+rem)-1;
            System.out.println(ans);
        }
        else if(qu%2!=0 && rem%2==0){
            ans=qu-1;
            System.out.println(ans);
        }
        // System.out.println(ans);
    }
}
