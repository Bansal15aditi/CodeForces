public class vanya_and_cubes {
    public static void main(String[] args) {
        int n=10;
        System.out.println(print_level(n));
    }
    public static int print_level(int n){
        int hght=0;
        int sum=0;
        for (int i = 1; n>= 0; i++) {
            sum=sum+i;
            if((n-sum)>=0){
                hght++;
            }
            n-=sum;
        }
        return hght;
    }
}
