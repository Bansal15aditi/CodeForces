import java.util.Scanner;

public class domino_filling {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int domino=2*1;
        System.out.println((m*n)/domino);
    }
}
