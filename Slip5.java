/*
    Write a program for multilevel inheritance such that Country is inherited from Continent.
    State is inherited from Country. Display the place, State, Country and Continent.
*/

class Continent {
    String continent;

    Continent(String continent) {
        this.continent = continent;
    }

    // public void display(){}
}

class Country extends Continent {
    String country;

    Country(String country, String continent) {
        super(continent);
        this.country = country;
    }
}

class State extends Country {
    String state;

    State(String state, String country, String continent) {
        super(country, continent);
        this.state = state;
    }
}

class Place extends State {
    String place;

    Place(String place, String state, String country, String continent) {
        super(state, country, continent);
        this.place = place;
    }

    public void display() {
        System.out.println(this.place + " " + this.state + " " + this.country + " " + this.continent);
    }
}

public class Slip5 {
    public static void main(String[] args) {

        Place place = new Place("Pune", "Maharashtra", "India", "Asia");

        place.display();
    }
}
