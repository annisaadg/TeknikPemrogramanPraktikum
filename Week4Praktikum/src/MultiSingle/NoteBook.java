/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiSingle;

/**
 *
 * @author ASUS
 */
public class NoteBook extends Laptopp {
    String lihatSpec() { 
    return "Merk: " + merk + ", processor: "+ processor + 
           ", jumlah memory: " + memory + 
           ", storage: "+ storage; 
    } 
    String cekNoteBook() { 
        return "Ini berasal dari class Netbook"; 
    }
}
