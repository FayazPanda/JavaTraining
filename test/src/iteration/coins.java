package iteration;

public class coins {
    public static void main(String[] args) {
        float cost = 4.58f;
        float cash = 20f;
        int[] coin = {1000,500,200,100,50,20,10,5,2,1};
        int[] ccounter = {0,0,0,0,0,0,0,0,0,0};

        int tcost = (int) (cost*100);
        int tcash = (int) (cash*100);
        tcash = tcost - tcash;
        for(int i = 0;i == coin.length;i++){
            for(;tcash < 0;ccounter[i]++){
                tcash = tcash - coin[i];
            }
            tcash = tcash + coin[i];
        }
        for(int i = 0;i == coin.length;i++){
            System.out.println("coin "+coin[i]+" was used "+ccounter[i]+" times!");
        }
    }
}
