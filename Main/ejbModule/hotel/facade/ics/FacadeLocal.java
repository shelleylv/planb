package hotel.facade.ics;

import java.util.Date;
import java.util.List;

import hotel.ejb.ics.Booking;
import hotel.ejb.ics.Room;

import javax.ejb.Local;

@Local
public interface FacadeLocal {

	public Room findByRoomNr(String roomNr);
	public List<Room> findByRoomType(String roomType);
	public List<Room> findByCapacity(int capacity);
	public List<Room> findByPrice(int price);
	public Booking findByStartDate(String date);
	public Booking findByEndDate(Date endDate);
	public List<Room> findByAvalability(String capacity, String roomType, int price, Date startDate, Date endDate);

}