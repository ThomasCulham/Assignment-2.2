
public class SumOfSquares{
    public static void String(String[] args){
        int sS=0;
        int Ss=0;
        int ans=0;
        for(int i = 0; i <= 100; i++){
            sS+=Math.pow(i,2);
            Ss+=i;
        }
        Ss*=Ss;
        ans=Ss-sS;
        System.out.println("");
        System.out.println(ans);
    }
}