import java.util.Scanner;

public class petya_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String s1=str1.toLowerCase();
        String s2=str2.toLowerCase();
        System.out.println(check_string(s1, s2));
    }
    public static int check_string(String s1,String s2){
        for(int i=0;i<s1.length()&&i<s2.length();i++){
            if((int)s1.charAt(i)==(int)s2.charAt(i)){
                continue;
            }
            else if((int)s1.charAt(i)<(int)s2.charAt(i)){
                return -1;
            }
            else if((int)s1.charAt(i)>(int)s2.charAt(i)){
                return 1;
            }
        }
        return 0;
    }
}
