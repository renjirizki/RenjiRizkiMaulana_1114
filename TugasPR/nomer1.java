import java.util.Scanner;
public class nomer1 {
    public static void main(String args[]){
        System.out.println("Pengecekan Bilangan Prima atau Bukan");
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukkan Bilangan :");
        int bilangan = inputan.nextInt();
        boolean prima = true;
        
        for(int index=2; index<=bilangan/2; index++){
            if(bilangan%index ==0){
                prima = false;
                break;

            }
        }

        if(prima && ((bilangan > 0 )&&(bilangan != 1)))
            System.out.println(bilangan + " merupakan bilangan prima");
        else
            System.out.println(bilangan + " bukan bilangan prima");
    
    inputan.close();

    }
}