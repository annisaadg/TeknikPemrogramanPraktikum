package no2;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Netbook netbookAnnisa = new Netbook();
     
        System.out.println(netbookAnnisa.lihatSpec());
        System.out.println(netbookAnnisa.cekKomputer());
        System.out.println(netbookAnnisa.cekLaptop());
        System.out.println(netbookAnnisa.cekNetbook());
    }
    
}
