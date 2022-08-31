package inheritence;

public class InheritenceDemo {
	
	public static void main (String args [] ) {
		
	MountainBike mountainBike =new MountainBike(20,10,1);
	System.out.println("Gear is :"+mountainBike.gear);
	System.out.println("Speed is :"+mountainBike.speed);
	System.out.println("Seat height is is :"+mountainBike.seatHeight);
	mountainBike.applyBrake(2);
	System.out.println("Bike speed after applying breaks :"+mountainBike.speed);
	}

}
