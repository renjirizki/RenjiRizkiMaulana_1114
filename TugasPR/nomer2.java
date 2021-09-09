public class nomer2{
    public static void main(String[] args) {
        int angka[] = {1, 2, 3, 1231, 43826, 83, 827, 1436, 2186, 9919, 4264, 72};

        System.out.print("\n Bilangan genap :");
        for(int a=0; a < 12; a++){
            if(angka[a] % 2 == 0){
                System.out.print(angka[a] + ",");
            }
        }
        System.out.print("\n Bilangan ganjil :");
        for(int b=0; b<12; b++){
            if(angka[b] % 2 !=0){
                System.out.print(angka[b] + ",");
            }
        }
    }    
}
