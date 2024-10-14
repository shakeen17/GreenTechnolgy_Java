package concept;

public class InheritanceBike extends InheritanceBicycle {
    public int seatHeight;
    
    // Constructor
    public InheritanceBike(int startHeight, int startSpeed, int startGear) {
        super(startGear, startSpeed);  // must be the first statement , otherwise java don't compile
        seatHeight = startHeight;
    }
    
    // Method to set seat height
    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }
}
