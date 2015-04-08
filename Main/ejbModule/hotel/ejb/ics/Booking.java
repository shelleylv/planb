package hotel.ejb.ics;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 

@Entity
@Table (name="Booking")
public class Booking implements Serializable {
       	
       	private String bookingNr;
       	private Date startDate;
		private Date endDate;
       	private Guest aGuest;
       	private Room aRoom;
       	
		@Id
       	@Column(name="bookingNr")
       	public String getBookingNr(){
                  	return bookingNr;
       	}
       	
		
		
		public void setBookingNr(String bookingNr) {
			this.bookingNr = bookingNr;
		}
       	@Temporal (TemporalType.DATE)
       	@Column(name="startDate")
       	public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
       	
		@Temporal (TemporalType.DATE)
       	@Column(name="endDate")
    	public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
       	
       	@ManyToOne
       	@JoinColumn(name="pNr", referencedColumnName="pNr")
       	
       	public Guest getaGuest(){
                  	return aGuest;
       	}
       	
       	public void setaGuest(Guest aGuest){
                  	this.aGuest = aGuest;
       	}

		@ManyToOne
       	@JoinColumn(name="roomNr", referencedColumnName="roomNr")
      	public Room getaRoom() {
			return aRoom;
		}

		public void setaRoom(Room aRoom) {
			this.aRoom = aRoom;
		}
       	
}