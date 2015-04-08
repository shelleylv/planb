package hotel.eao.ics;

import java.util.Date;

import hotel.ejb.ics.Booking;

import javax.ejb.Local;

@Local
public interface BookingEAOLocal {
	public Booking findByStartDate(String startDate);
	public Booking findByEndDate(Date endDate);
	
}
