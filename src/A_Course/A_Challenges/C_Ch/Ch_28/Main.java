package A_Course.A_Challenges.C_Ch.Ch_28;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Place> places = new LinkedList<>();

        addPlace(places, new Place("Alexandria", 220));
        addPlace(places, new Place("Cairo", 0));
        addPlace(places, new Place("Aswan", 870));
        addPlace(places, new Place("Giza", 20));
        addPlace(places, new Place("Luxor", 670));
        addPlace(places, new Place("Cairo", 0));

        System.out.println("\nFinal places order:");
        for (Place place : places) {
            System.out.println(place.getName() + " -> " + place.getlength() + " km");
        }

    }

    private static void addPlace(LinkedList<Place> places, Place place) {
        for (Place p : places) {
            if (p.getName().equals(place.getName())) {
                return;
            }
        }
        for(int i = 0 ; i < places.size(); i++){
            if(places.get(i).getlength() > place.getlength()){
                places.add(i, place);
                return;
            }
        }

        places.add(place);
        System.out.println("Added " + place.getName() + " to the list.");

    }
}
