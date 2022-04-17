package polymorphism;

// Driver class BasketballPlayerDriver definition
public class BasketballPlayerDriver {
    // Main method definition

    public static void main(String ss[]) {
        // Declares 3 class objects
        BasketballPlayer bp1;
        CollegeBasketballPlayer bp2;
        ProBasketballPlayer bp3;

        // Creates 3 class objects
        bp1 = new BasketballPlayer("Tim Duncan", "Center", "spurs", 83, 220, 4, 5, 8);
        bp2 = new CollegeBasketballPlayer("Jaylen Reynolda", "Forward", "Xavier", 82, 215, 7, 7, 3, 1, "starter");
        bp3 = new ProBasketballPlayer("D Angelo Russell", "Guard", "Lakers", 77, 190, 7, 9, 7, 1, "starter");

        System.out.println(bp1);
        System.out.println(bp1.getValue());
        System.out.println(bp2);
        System.out.println(bp2.draftable());
        System.out.println(bp3);
        System.out.println(bp3.newContractValue());
        
        bp1 = new CollegeBasketballPlayer("Troy Gaupain", "Guard", "UC");
        System.out.println(bp1);
        System.out.println(((CollegeBasketballPlayer)bp1).draftable());
        
        bp2 = new CollegeBasketballPlayer("Troy Caupain", "Guard", "UC", 75, 180, 9, 6, 8, 1, "starter");
        System.out.println(bp2);
        System.out.println(bp2.draftable());
        
        bp1 = new BasketballPlayer("J P Macura", "Guard", "Xavier", 77, 190, 8, 4, 5);
        System.out.println(bp1.getValue());
        System.out.println(bp3.getValue());

        bp3 = new ProBasketballPlayer("Lebron James", "Forward", "Cavs", 81, 250, 9, 10, 5, 10, "starter");
        System.out.println(bp3);
        System.out.println(bp3.newContractValue());

        /**
         * Type mismatch: cannot convert from BasketballPlayer to ProBasketballPlayer.
         *  bp3 = new BasketballPlayer("Matt Stainbrook", "Center", "Merlins", 82, 270, 6, 5, 6);
            System.out.println(bp3);
         * 
         */
        bp1 = new BasketballPlayer("Matt Stainbrook", "Center", "Merlins", 82, 270, 6, 5, 6);
        System.out.println(bp1);
        //diubah menjadi bp1 dari yang asalnya bp3
        
        bp3 = new ProBasketballPlayer("David West", "Forward", "Spurs", 80, 215, 7, 6, 8, 10, "bench");
        System.out.println(bp3);
        /**
         * Method draftable() is undefined for the type ProBasketballPlayer
         * hal ini dikarenakan method draftable() hanya bisa dipakai untuk bp2 atau bp1 yang diinisialisasi sebagai CollegeBasketballPlayer.
         * System.out.println(bp3.draftable());
         */
        System.out.println(bp3.newContractValue());
    }// End of main method
}// End of driver class