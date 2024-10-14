package concept;

public class InheritanceDemo {
   public static void main(String[] args) {
       // Create an instance of InheritanceBike
       InheritanceBike bk = new InheritanceBike(20, 10, 1);  // Seat height: 20, Speed: 10, Gear: 1
       
       // Accessing the properties and methods
       System.out.println("Bike seat height: " + bk.seatHeight);
       System.out.println("Bike speed: " + bk.speed);
       System.out.println("Bike gear: " + bk.gear);
       
       // Using methods inherited from InheritanceBicycle
       bk.speedUp(5);  // Increase speed
       System.out.println("Updated speed after speeding up: " + bk.speed);
       
       bk.applyBrake(2);  // Apply brake
       System.out.println("Updated speed after applying brake: " + bk.speed);
   }
}
