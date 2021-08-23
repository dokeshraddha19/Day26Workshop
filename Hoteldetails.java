package Hotelchain;

public class Hoteldetails {
	public String hotelname;
	public int rating;
	public int weekday_regularcustomer_rate;
	public int weekday_rewardcustomer_rate;
	public int weekend_regularcustomer_rate;
	public int weekend_rewardcustomer_rate ;
	 Hoteldetails(String hotelname,int rating,int weekday_regularcustomer_rate,int  weekday_rewardcustomer_rate,int weekend_regularcustomer_rate,int weekend_rewardcustomer_rate) {
		this.hotelname=hotelname;
		this.weekday_regularcustomer_rate=weekday_regularcustomer_rate;
		this.weekday_rewardcustomer_rate=weekday_rewardcustomer_rate;
		this.weekend_regularcustomer_rate=weekend_regularcustomer_rate;
		
		this.weekend_rewardcustomer_rate= weekend_rewardcustomer_rate;
	}
	 public String getHotel1() {
		 return this.hotelname;
	 }
	 public String getHotel2() {
		 return this.hotelname;
	 }
	 public String getHotel3() {
		 return this.hotelname;
	 }
	 public int getrating() {
		 return this.rating;
	 }
	 public int weekday_regularcustomer_rate() {
		 return this.weekday_regularcustomer_rate;
	 }
	 public int weekday_rewardcustomer_rate() {
		 return this.weekday_rewardcustomer_rate;
	 }
	 public int weekend_regularcustomer_rate() {
		 return this.weekend_regularcustomer_rate;
	 }
	 public int weekend_rewardcustomer_rate() {
		 return this.weekend_rewardcustomer_rate;
	 }
	 
}
		

