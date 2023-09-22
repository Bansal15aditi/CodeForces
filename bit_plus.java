import java.util.*;
public class bit_plus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int X=0,i=0,j=0;
        while(i<t)
        {   j=0;
            String str=sc.next();
            if((str.charAt(j)=='+' && str.charAt(j+1)=='+')  ||(str.charAt(j+1)=='+' && str.charAt(j+2)=='+') ){
                X++;
            }
            else if((str.charAt(j)=='-' && str.charAt(j+1)=='-')  ||(str.charAt(j+1)=='-' && str.charAt(j+2)=='-') ){
                X--;
            }
            i++;
        }
        System.out.println(X);
    }
}
