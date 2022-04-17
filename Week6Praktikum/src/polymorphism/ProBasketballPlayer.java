package polymorphism;

// Defines a derived class ProBasketballPlayer from super class BasketballPlayer  
class ProBasketballPlayer extends BasketballPlayer {
    // Instance variables to store pro basketball player data
    private int yearsInLeague;
    private String role;
    // Default constructor definition
    ProBasketballPlayer() {
        // Calls the base class default constructor  
        super();
        yearsInLeague = 0;
        role = "bench";
    }// End of default constructor
    // Parameterized constructor to assign only string data
    ProBasketballPlayer(String name, String position, String team) {
        // Calls the base class default constructor  
        super(name, position, team);
        yearsInLeague = 0;
        role = "bench";
    }// End of parameterized constructor
    // Parameterized constructor to assign all data
    ProBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int yearsInLeague, String role) {
        // Calls the base class default constructor  
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.yearsInLeague = yearsInLeague;
        this.role = role;
    }// End of parameterized constructor
    // Method to return eligibility remaining
    int getYearsInLeague() {
        return yearsInLeague;
    }// End of method
    // Method to return role
    String getRole() {
        return role; 
    }// End of method
    // Overriding toString() method to return college basketball player information
    public String toString() {
        return super.toString() + "\n Years In League: " + yearsInLeague + "\t Role: " + role;
    }// End of method
    // Returns the amount based on the condition
    int newContractValue() {
        int amt = -1;
        if(yearsInLeague < 3)
        amt = 0;
        if(role.equalsIgnoreCase("Starter")) {
            if(super.getValue() > 8 && yearsInLeague >= 10)
            amt = 12000000;
            else if(super.getValue() > 7) {
                if(yearsInLeague >= 8)
                amt = 10000000;
                else if(yearsInLeague >= 5)
                amt = 8000000;
            }
            else if(super.getValue() > 5) {
                if(yearsInLeague >= 10)
                amt = 6000000;
                else if(yearsInLeague >= 5)
                amt = 2000000;
            }
            else
            amt = 1000000;
        }
        else if(role.equalsIgnoreCase("Bench")) {
            if(super.getValue() > 8 && yearsInLeague >= 10)
            amt = 7500000;
            else if(super.getValue() > 7 && yearsInLeague >= 8)
            amt = 5000000;
            else if(super.getValue() > 5) {
                if(yearsInLeague >= 10)
                amt = 4500000;
                else if(yearsInLeague >= 7)
                amt = 200000;
            }
            else
            amt = 5000000;
        }
        else
        System.out.println("\n Invalid Position.");;
        return amt;
    }// End of method
}// End of class ProBasketballPlayer
