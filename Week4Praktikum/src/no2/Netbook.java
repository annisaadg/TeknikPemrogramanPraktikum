package no2;

/**
 *
 * @author Annisa
 */
public class Netbook extends Laptop{
    String lihatSpec() { 
    return "Merk: " + merk + ", processor: "+ processor + 
           ", jumlah memory: " + memory + 
           ", storage: "+ storage; 
    } 
    String cekNetbook() { 
        return "Ini berasal dari class Netbook"; 
    }
}
