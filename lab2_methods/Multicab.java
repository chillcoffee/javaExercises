
package lab2_methods;

public class Multicab {
    private float fare, collection;
    private String origin, destination;

    public Multicab(String origin, String destination, float fare) {
        this.fare = fare;
        this.origin = origin;
        this.destination = destination;
    }
    
    public float calculateFare(float discount){
        float discountedFare = fare - discount;
        return discountedFare;
    }
    
    public float calculateFare(int passengers){
        float totalFare = passengers * fare;
        return totalFare;
    }
    
    public float calculateFare(int passengers, float discount){
        float totalFare = passengers * fare;
        return totalFare;
    }
    
    public void setCollection(float collection) {
        this.collection += collection;
    }
    
    public void getCollection() {
        System.out.print(this.getClass().getSimpleName());
        System.out.println(" Total Collection: "+String.format("%.2f", collection));
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
