package polymorphism;

// Super class BasketballPlayer definition
class BasketballPlayer {
    // Instance variables to store data
    protected String name, position, team;
    protected int height, weight, agility, speed, ballHandling;
    
    // Default constructor definition
    BasketballPlayer() {
        name = position = team = "unknown";
        height = weight = agility = speed = ballHandling = 0;

    }// End of default constructor

    // Parameterized constructor to assign only string data
    BasketballPlayer(String name, String position, String team) {
        this.name = name;
        this.position = position;
        this.team = team;
        height = weight = agility = speed = ballHandling = 0;

    }// End of parameterized constructor

    // Parameterized constructor to assign all data
    BasketballPlayer(String name, String position, String team, int height, int weight, int agility,int speed, int ballHandling) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.height = height;
        this.weight = weight;
        this.agility = agility;
        this.speed = speed;
        this.ballHandling = ballHandling;
    }// End of parameterized constructor

    // Method to return name
    String getName() {
        return name;
    }// End of method

    // Method to return position
    String getPosition() {
        return position;
    }// End of method

    // Method to return team name
    String getTeam() {
        return team;
    }// End of method

    // Method to return height
    int getHeight() { 
        return height;
    }// End of method

    // Method to return weight
    int getWeight() { 
        return weight;
    }// End of method

    // Method to return agility
    int getAgility() { 
        return agility;
    }// End of method

    // Method to return speed
    int getSpeed() {
        return speed;
    }// End of method

    // Method to return ball handling capacity
    int getBallHandling() { 
        return ballHandling;
    }// End of method

    // Overriding toStriung() method to return player information
    public String toString() {
        return "\n Name: " + name + "\n Position: " + position + "\n Team: " + team + "\n Height: " + height + "\n Weight: " + weight + "\n Agility: " + agility + "\n Speed: " + speed + "\n Ball Handling: " + ballHandling + "\n Value: " + getValue();
    }// End of method

    // Method to return value based on the condition
    int getValue() {
        if(position.equalsIgnoreCase("Center")) { 
            if((height >= 82) && (weight > 220 && weight < 250) && (ballHandling > 5))
            return 10;
            else if((height >= 80) && (weight > 210 && weight < 260) && (ballHandling > 5))
            return 8;
            else if((height >= 80) && (ballHandling > 4))
            return 6;
            else if((height >= 78) && (agility > 7))
            return 5;
            else if(height >= 78)
            return 4;
            else if((height >= 76) && (agility > 5))
            return 2;
            else
            return 0;
        }// End of if condition
        else if(position.equalsIgnoreCase("Forward")) {
            if((height >= 80) && (agility > 8 || speed > 7))
            return 10;
            else if((height >= 78) && (agility > 6) && (speed > 5))
            return 8;
            else if((height >= 77) && (agility > 5))
            return 6; 
            else if((height >= 76) && (speed > 4))
            return 5;
            else if((height >= 75) && ((agility > 3 || speed > 3)))
            return 3;
            else if(height >= 74)
            return 1;
            else
            return 0;
        }// End of else if condition
        else if(position.equalsIgnoreCase("Guard")) {
            if((height >= 78) && (ballHandling > 7) && (agility > 7 || speed > 7))
            return 10;
            else if((height >= 76) && (ballHandling > 7) && (agility > 6 || speed > 6))
            return 8;
            else if((height >= 74) && (ballHandling > 5) && (agility > 5) && (speed > 6))
            return 6;
            else if((ballHandling > 6) && (agility > 6) && (speed > 5))
            return 4;
            else if((ballHandling > 4) && (agility > 4))
            return 2;
            else
            return 0;
        }// End of else if condition
        else {
            System.out.println("\n Invalid Position.");
            return -1;

        }// End of else

    }// End of method
    
}// End of class