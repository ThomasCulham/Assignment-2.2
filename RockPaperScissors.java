import java.util.Scanner;public class RockPaperScissors{
    public static void main (String[]args){
        System.out.println("Good luck, human ...");
        boolean run = true;
        boolean valid = true;
        int player=0;
        int me=0;
        int win=0;
        int loss=0;
        int draw=0;
        Scanner sc = new Scanner(System.in);

        while(run){

            System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors?   "  );
            player = sc.nextInt();

            if(player<4&&player>0){
                valid=true;
            }else{
                valid=false;
            }

            if(valid){
                me=random(1,3);
                System.out.print("You threw ");
                if(player==1){
                    System.out.print("Rock");
                }else if(player==2){
                    System.out.print("Paper");
                }else{
                    System.out.print("Scissors");
                }
                System.out.print("! I thew ");
                if(me==1){
                    System.out.print("Rock");
                }else if(me==2){
                    System.out.print("Paper");
                }else{
                    System.out.print("Scissors");
                }
                System.out.println("!");
                if(player==me){
                    System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                    draw++;
                }else{
                    if(me==1&&player==3||me==2&&player==1||me==3&&player==2){
                        System.out.println("HAHAHAHAHAHAHAHHA I HAVE BEAT YOU HUMAN. YOU NEVER HAD A CHANCE!!!!!!!!!");
                        loss++;
                    }else{
                        System.out.println("....   >:(   We machienes never forget......... Your sin will never be forgotten.  ");
                        draw++;
                    }
                }
            } else{
                System.out.println("Why are  so dumb?");
                System.out.println("Now lets try that again.");
                System.out.println("");
            }
            System.out.println("");
            System.out.print("Would you like to roll again? (y/n)  ");
            String Ans = sc.next();
            System.out.println("");
            if(Ans.equals("n")||Ans.equals("n")){
                run=false;
                System.out.println("Good Game! Thanks for playing.");
                for(int i=0; i<100; i++){
                    System.out.print("*****");
                }
                System.out.println("");
                System.out.println("Wins:"+ win);
                System.out.println("Losses:"+ loss);
                System.out.println("Draws"+ draw);
            }

        }
    }

    public static int random(int min, int max) {      
        return (int)(Math.random()*((max-min)+1))+1;
    }
}