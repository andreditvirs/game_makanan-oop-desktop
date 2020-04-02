
import java.util.ArrayList;
public class View {
    public void cetak(ArrayList<Makanan> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(i+" ");
            if(list.get(i) instanceof MakananLVL2){
                MakananLVL2 lvl2 = (MakananLVL2)list.get(i);
                System.out.println(lvl2.toString());
            }else if(list.get(i) instanceof MakananLVL3){
                MakananLVL3 lvl3 = (MakananLVL3)list.get(i);
                System.out.println(lvl3.toString());
            }else{
                Makanan makanan = (Makanan)list.get(i);
                System.out.println(makanan.toString());
            }
            
        }
    }
}
