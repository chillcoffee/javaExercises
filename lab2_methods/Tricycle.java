
package lab2_methods;

public class Tricycle {
    public float fare, collection;
    public String origin, destination;

    public Tricycle(String origin, String destination, float fare) {
        this.fare = fare;
        this.origin = origin;
        this.destination = destination;
        this.collection = 0.0f;
    }
    
    public float calculateFare(float discount){
        float discountedFare = fare - discount;
        return discountedFare;
    }

    public void getCollection() {
        System.out.print(this.getClass().getSimpleName());
        System.out.println(" Total Collection: "+String.format("%.2f", collection));
    }

    public void setCollection(float collection) {
        this.collection += collection;
    }
    
    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public void getDetails(){
        System.out.print("From "+origin+" to "+destination+": ");
        System.out.println(String.format("%.2f", fare));
    }
    
}
