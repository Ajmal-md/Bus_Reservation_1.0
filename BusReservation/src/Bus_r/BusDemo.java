package Bus_r;
import java.util.*;
public class BusDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Bus>buses=new ArrayList<Bus>();
		ArrayList<Booking>book=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,2));
		for(Bus b:buses) {
			b.displayInfo();
		}
		int userOpt=1;
		while(userOpt==1){
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt=sc.nextInt();
			if(userOpt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(book,buses)) {
					book.add(booking);
					System.out.println("Your booking is confirmed, Thank you");
				}
				else {
					System.out.println("Sorry, Bus is full. Try another bus");
				}
			}
			
			
		}
	}

}
