package RoadTrip;

import java.util.ArrayList;

public class RoadTrip
{
	private ArrayList<GeoLocation> stops = new ArrayList<GeoLocation>();
	
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude) {
    	stops.add(new GeoLocation(name, latitude, longitude));
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops() {
    	return stops.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength() {
    	double distance = 0;
    	for(int i = 1; i < stops.size(); i++) {
    		distance += stops.get(i).distanceFrom(stops.get(i-1));
    	}
    	return distance;
    }
    
    // Return a formatted toString of the trip
    public String toString() {
    	String result = "";
    	for(int i = 0; i < stops.size(); i++ ) {
    		result += (i+1) + ". " + stops.get(i).toString() + "\n";
    	}
    	return result;
    }
}



/* Starter
public class RoadTrip
{
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    
    // Get the total miles of the trip
    public double getTripLength()
    
    // Return a formatted toString of the trip
    public String toString()
}



*/