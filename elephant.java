import java.util.Scanner;

public class elephant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<=5){
            System.out.println(1);
        } else{
            System.out.println((x/5)+1);
        }
        // else if((x/5)%2!=0){
        //     System.out.println(x/5);
        // }
        // else if((x/5)%2==0){
        //     System.out.println((x/5)+1);
        // }
    }
}
