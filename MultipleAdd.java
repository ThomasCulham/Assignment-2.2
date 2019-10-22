
public class MultipleAdd
{
    public static void String(String[] args){
        int n=0;
        for(int i=0; i<1000; i++){
            if(i%3==0){
                n+=i;
            }else if(i%5==0){
                n+=i;
            }
        }
        System.out.println(n);
    }
}
