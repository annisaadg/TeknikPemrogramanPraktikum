package polymorphism;

// Defines a derived class CollegeBasketballPlayer from super class BasketballPlayer
class CollegeBasketballPlayer extends BasketballPlayer {
    // Instance variables to store college basketball player data
    private int eligibilityRemaining;
    private String role;
    // Default constructor definition
    CollegeBasketballPlayer() { 
        // Calls the base class default constructor  
        super();
        eligibilityRemaining = 0;
        role = "unknown";
    }// End of default constructor
    // Parameterized constructor to assign only string data
    CollegeBasketballPlayer(String name, String position, String team) { 
        // Calls the base class default constructor  
        super(name, position, team);
        eligibilityRemaining = 4;
        role = "bench";
    }// End of parameterized constructor
    // Parameterized constructor to assign all data
    CollegeBasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling, int eligibilityRemaining, String role) {
        // Calls the base class default constructor  
        super(name, position, team, height, weight, agility, speed, ballHandling);
        this.eligibilityRemaining = eligibilityRemaining;
        this.role = role;
    }// End of parameterized constructor
    // Method to return eligibility remaining
    int getEligibilityRemaining() {
        return eligibilityRemaining;
    }// End of method
    // Method to return role
    String getRole() {
        return role;
    }// End of method
    // Overriding toString() method to return college basketball player information
    public String toString() {
        return super.toString() + "\n Eligibility Remaining: " + eligibilityRemaining + "\t Role: " + role;
    }// End of method
    // Method to return true if the specified condition is satisfies otherwise returns false
    boolean draftable() {
        if(role.equalsIgnoreCase("bench") && super.getValue() >= 8)
        return true;
        else if(role.equalsIgnoreCase("starter") && super.getValue() > 4)
        return true;
        else
        return false;
    }// End of method
}// End of class CollegeBasketballPlayer