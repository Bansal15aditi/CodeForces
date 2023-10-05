import java.util.Scanner;

public class word_capital {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        aditi_string(str);
    }
    public static void aditi_string(String str){
        String  ch=str.substring(0,1).toUpperCase();
        String res_str=str.substring(1);
        System.out.println(ch+res_str);   
    }
}
