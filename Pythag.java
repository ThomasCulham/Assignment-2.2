
import java.util.Scanner;public class Pythag{
    public static void main (String[]args){
        double a=0, b=0, c=0;
        boolean run = true;
        int num =1000;
        while(run){
            while(a<(num/2)){
                c=Math.sqrt(   Math.pow(a,2) + Math.pow(b,2) );
                if(a+b+c==num){
                    run=false;
                    System.out.println( a+", "+b +", "+ c);
                    System.out.println(a*b*c);
                } 
                a++;
            }

            a=0;
            b++;
        }
    }
}