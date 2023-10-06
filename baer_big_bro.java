import java.util.Scanner;

public class baer_big_bro {
    public static void main(String[] srgs){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i;
        for ( i = 1; ; i++) {
            a*=3;
            b*=2;
            if(a>b){
                break;
            }
        }
        System.out.println(i);
    }
}
