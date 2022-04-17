package generic;

import java.util.ArrayList;

public class MethodArguments {
    public static void main(String args[]) {

        ArrayList<String> a = new ArrayList<String>();
    
        a.add("Pizza");
        a.add("Spaghetti");
        a.add("Quesadillas");
    
        System.out.println(a);
        display(a);
    }
    
    static void display(ArrayList<String> arrayList1) {

        ArrayList<String> b = new ArrayList<String>();
    
        b.add("Tiramisu");
        b.add("Banoffee");
        b.add("Lotus");
        b.add("Sweet");
    
        System.out.println(b);

        arrayList1.add("Salty");
    
        System.out.println(arrayList1); // passing the arraylist values and
                                        // adding the element
    
    }
    
}