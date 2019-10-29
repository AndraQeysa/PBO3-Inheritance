package Latihan;

public class MountainTruck extends Truck {
    // the MountainTruck subclass adds one field
    public int seatHeight;
    
    // the MountainTruck subclass has one contructor
    public MountainTruck (int startHeight, int startCadence, int startSpeed, 
                            int startGear){
        super (startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    
    // the mountainTruck subclass adds one method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main (String[] aku){
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("Geer = "+ MB.gear);
        System.out.println("Speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("Gear = " + MB.gear);
        System.out.println("Speed = " +MB.speed);
        MB.speedUp(2);
        System.out.println("Gear = "+MB.gear);
        System.out.println("Speed = "+ MB.speed);
    }
}
