import java.util.Arrays;
public class nomer4{
    public static void main(String[] args) {

        int[]knight = {1, 3, 4};
        int[]dragon_head = {9, 10};

        Arrays.sort(knight);
        Arrays.sort(dragon_head);
        
        int indeks_dragon = 0;
        int height = 0;
        for (int x: knight){
            if (indeks_dragon < dragon_head.length){
                if (x >= dragon_head[indeks_dragon]){
                    height += x;
                    indeks_dragon++;
                }
            }
        }
        if (indeks_dragon == dragon_head.length){
            System.out.println(height);
        }else{
            System.out.println("knight Fall");
        }
        }
}