/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author Annisa
 */
public class Language extends Fronted implements BackEnd{
    String language = "Java";
    
    // implements method of interface
    public void connectServer(){
        System.out.println(language + " can be used as backend.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object of Langauge class
        Language java = new Language();
        
        java.connectServer();
        
        // call the inherited method of Fronted class
        java.responsive(java.language);
    }

    
}
