
import java.util.ArrayList;

public class Test{

    public static void main(String[] args) {
        View view=new View();
        FormInput input=new FormInput("Kombinasikan Makanan");
        ArrayList<Makanan> list = new ArrayList<Makanan>();
        
        list.add(new Makanan("Nasi"));
        list.add(new Makanan("Telur"));
        list.add(new Makanan("Telur"));
        list.add(new Makanan("Ayam"));
        
        while(true){
            System.out.println("List Makanan Anda : ");
            view.cetak(list);
            int[] result = input.inputInt();
            Makanan makanan = FoodProcessor.combine(list.get(result[0]), list.get(result[1]));
            if(makanan!=null){
                list.add(list.size(), makanan);
                Makanan satu = list.get(result[0]);
                Makanan dua = list.get(result[1]);
                list.remove(satu);
                list.remove(dua);
            }
        }
    }
    
    
}
