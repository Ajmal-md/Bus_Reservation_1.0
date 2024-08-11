package Bus_r;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passenger;
	int busNo;
	Date date;
	
	Scanner sc=new Scanner(System.in);
	
	Booking(){
		System.out.println("Enter name of passenger: ");
		this.passenger=sc.next();
		System.out.println("Enter Number of Bus: ");
		this.busNo=sc.nextInt();
		System.out.println("Enter date dd-mm-yyyy: ");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Booking> book,ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking b:book) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
		
	}
}
