package concept;

public class InheritanceBicycle {
     protected int gear;
     protected int speed;
     
     public InheritanceBicycle(int startGear, int startSpeed) {
    	 gear = startGear;
    	 speed = startSpeed;
     }
     
     public void setGear(int newValue) {
    	 gear = newValue;
     }
     
     public void applyBrake(int dec) {
    	 speed -= dec;
     }
     
     public void speedUp(int inc) {
    	 speed += inc;
     }
}
