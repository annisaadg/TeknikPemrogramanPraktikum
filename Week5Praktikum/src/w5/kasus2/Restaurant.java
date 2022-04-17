package w5.kasus2;

/**
 *
 * @author Annisa Dinda
 */
public class Restaurant {
    
    public InfoMakanan[] MenuMakanan;
    public static byte id=0;
    
    public Restaurant(){
        MenuMakanan = new InfoMakanan[10];
        for(int index=0; index<10; index++){
            MenuMakanan[index] = new InfoMakanan();
        }
        id = 1;
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.MenuMakanan[id].setNama_makanan(nama);
        this.MenuMakanan[id].setHarga_makanan(harga);
        this.MenuMakanan[id].setStok(stok);
    }
    
    public void tampilMenuMakanan(){
        System.out.println("");
        System.out.println("__________________________________");
        System.out.println("                                  ");
        System.out.println("           MENU RESTAURANT        ");
        System.out.println("__________________________________");
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                if(i==1){
                    System.out.println(i+")."+MenuMakanan[i].getNama_makanan() 
                    +"["+MenuMakanan[i].getStok()+"]"+"\tRp. "
                    +MenuMakanan[i].getHarga_makanan());
                }else{
                    System.out.println(i+")."+MenuMakanan[i].getNama_makanan() 
                    +"["+MenuMakanan[i].getStok()+"]"+"\t\tRp. "
                    +MenuMakanan[i].getHarga_makanan());
                }
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(MenuMakanan[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
    
    public void updateStock(int id, int jmlPesanan){
        int stok = MenuMakanan[id].getStok() - jmlPesanan;
        MenuMakanan[id].setStok(stok);
    }
    
    public void orderFood(String nama, int jmlPesanan){
        double total=0;
        int tmp=0;
        for(int index=0; index<=id; index++){
            if((MenuMakanan[index].getNama_makanan()).equals(nama)){
                if(!isOutOfStock(index)){
                    tmp = MenuMakanan[index].getStok()-jmlPesanan;
                    MenuMakanan[index].setStok(tmp);
                    total = jmlPesanan * MenuMakanan[index].getHarga_makanan();
                    printOrder(nama, total);
                }
            }
        }
    }
    
    public void printOrder(String nama, double total){
        System.out.println("");
        System.out.println("__________________________________");
        System.out.println("                                  ");
        System.out.println("           Info Pemesanan         ");
        System.out.println("__________________________________");
        System.out.println(nama + "\t\t\tRp. " + total);
        System.out.println("");
    }
}
