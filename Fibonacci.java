
public class Fibonacci{
    public static void String(String[] args){
        int n=3;
        int l1=2; 
        int l2=1;
        int sum=2;
        while(sum<4000000){
            n=(l2+l1);
            l2=l1;
            l1=n;
            if(n%2==0){sum+=n;}
        }
        System.out.println("");
        System.out.println(sum);
        System.out.println(4613732);
    }
}
