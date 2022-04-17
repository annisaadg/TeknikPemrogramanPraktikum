/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MultiSingle;

/**
 *
 * @author Annisa
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NoteBook notebookAnnisa = new NoteBook();
     
        System.out.println(notebookAnnisa.lihatSpec());
        System.out.println(notebookAnnisa.cekComputer());
        System.out.println(notebookAnnisa.cekLaptopp());
        System.out.println(notebookAnnisa.cekNoteBook());
    }
}
