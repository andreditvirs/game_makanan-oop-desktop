
public class FoodProcessor {

    public static Makanan combine(Makanan element1, Makanan element2) {
        
        if(element1 instanceof MakananLVL2){
            MakananLVL2 element12 = (MakananLVL2)element1;
            MakananLVL2 element22 = (MakananLVL2)element2;
            if(element1.getNama().equalsIgnoreCase("NasiGoreng") && element2.getNama().equalsIgnoreCase("Omelet"))
                return new MakananLVL3(element12, element22, "NasiGorengSpecial");
            else if(element1.getNama().equalsIgnoreCase("Omelet") && element2.getNama().equalsIgnoreCase("NasiGoreng"))
                return new MakananLVL3(element12, element22, "NasiGorengSpecial");
            else
                return null;
            
            
            
            
        }else if(element1 instanceof MakananLVL3){
            return null;
            
            
        }else{
            if(element1.getNama().equalsIgnoreCase("nasi") && element2.getNama().equalsIgnoreCase("telur"))
                return new MakananLVL2(element1, element2, "NasiGoreng");
            else if(element1.getNama().equalsIgnoreCase("telur") && element2.getNama().equalsIgnoreCase("nasi"))
                return new MakananLVL2(element1, element2, "NasiGoreng");
            else if(element1.getNama().equalsIgnoreCase("ayam") && element2.getNama().equalsIgnoreCase("telur"))
                return new MakananLVL2(element1, element2, "Omelet");
            else if(element1.getNama().equalsIgnoreCase("telur") && element2.getNama().equalsIgnoreCase("ayam"))
                return new MakananLVL2(element1, element2, "Omelet");
            else
                return null;
        }
        
    }
    
    
}
