package Hotelchain;

public class HotelReservationSystem {
	public static void main(String[] args) {
		welcome();
		Hoteldetails Hotel1=new Hoteldetails("Lakewood",3,110,80,90,80);
		Hoteldetails Hotel2=new Hoteldetails("Bridgewood",4,160,110,60,50);
		Hoteldetails Hotel3=new Hoteldetails("Ridegewood",5,220,100,150,40);
	}
	public static void welcome() {
		System.out.println("Welcome to Hotel Reservation Program");
	}
}

		
