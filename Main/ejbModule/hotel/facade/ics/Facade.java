 package hotel.facade.ics;

import java.util.Date;
import java.util.List;

import hotel.eao.ics.BookingEAOLocal;
import hotel.eao.ics.RoomEAOLocal;
import hotel.ejb.ics.Booking;
import hotel.ejb.ics.Room;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class Facade implements FacadeLocal {
	
	@EJB
	private RoomEAOLocal roomEAO;
    
	@EJB
	private BookingEAOLocal bookingEAO;
	
	public Facade() {
    }
    
	  public List<Room> findByAvalability(String capacity, String roomType, int price, Date startDate, Date endDate){
	    	return roomEAO.findByAvalability(capacity, roomType, price, startDate, endDate);
	    }
	  
	  public Room findByRoomNr (String roomNr){
	    	return roomEAO.findByRoomNr(roomNr);
	    }

	    public List<Room> findByRoomType (String roomType){
	    	return roomEAO.findByRoomType(roomType); 	
	    }
	    
	    public List<Room> findByCapacity (int capacity){
	    	return roomEAO.findByCapacity(capacity);
	    }
	    
	    public List<Room> findByPrice (int price){
	    	return roomEAO.findByPrice(price);
	    }
	    
	    public Booking findByStartDate(String startDate){
	    	return bookingEAO.findByStartDate(startDate);
	    }
	    
	    public Booking findByEndDate(Date endDate){
	    	return bookingEAO.findByEndDate(endDate);
	    }
	}
