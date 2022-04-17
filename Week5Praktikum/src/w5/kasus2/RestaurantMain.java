package w5.kasus2;
import java.util.Scanner;

/**
 *
 * @author Annisa
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
    
        menu.tampilMenuMakanan();
        
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("__________________________________");
        System.out.println("                                  ");
        System.out.println("          ORDER YOUR FOOD!        ");
        System.out.println("__________________________________");
        System.out.print("Nama Makanan : ");
        String nama = sc.next(); // input nama makanan
        System.out.print("Banyak Pesanan : ");
        int jumlah = sc.nextInt(); // input jumlah makanan
        menu.orderFood(nama, jumlah);
        menu.tampilMenuMakanan();
        
    }
    
}
