package lab2_methods;

public class Commute {
    public static void main(String[] args) {
        Student me = new Student(0.0f, 5.0f);
        me.askBaon();
        me.getDetails();
        
        Tricycle polo = new Tricycle ("Polo","Banga",25.0f);
        polo.setFare(polo.calculateFare(me.getDiscount()));
        me.pay(polo.getFare());
        polo.setCollection(polo.getFare());
        polo.getDetails();
        
        Multicab multicab = new Multicab ("Banga","Kalibo",25.0f);
        multicab.setFare(multicab.calculateFare(me.getDiscount()));
        me.pay(multicab.getFare());
        multicab.setCollection(multicab.getFare());
        multicab.getDetails();
        
        me.getDetails();    
        multicab.getCollection();
        polo.getCollection();
        
        //
    }
}
