public class nomer3 {
    public static void main(String[] args) {
        int angka_list[] = {12, 1, 5, 8, 2, 4, 9, 3, 7};
        int angka = 2;
        int index = angka_list.length / 2;
        int tengah = index;

        while (index<angka_list.length && index>=0){

            if(angka == angka_list[index]){
                System.out.println("Data berada pada index ke-" + index);
                break;
            }
            else{

                if (angka<angka_list[tengah]){
                    index--;
                    break;
                }
                else{
                    index++;
                    break;
                }
            }
        }
    }
}

