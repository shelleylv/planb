package hotel.ejb.ics;

import java.io.Serializable;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="Guest")
public class Guest implements Serializable {
       	private String pNr;
       	private String name;
       	private String phoneNr;
       	private Set<Booking> bookings;
       	
       	@Id
       	@Column(name="pNr")
       	public String getPNr(){
                  	return pNr;
       	}
       	
       	public void setPNr(String pNr){
                  	this.pNr = pNr;
       	}
       	
       	@Column(name="name")
       	public String getName(){
                  	return name;
       	}
       	
       	public void setName(String name){
                  	this.name = name;
       	}
       	
       	@Column(name="phoneNr")
       	public String getPhoneNr(){
                  	return phoneNr;
       	}
       	
       	public void setPhoneNr(String phoneNr){
                  	this.phoneNr = phoneNr;
       	}
       	
       	@OneToMany(mappedBy="aGuest", fetch=FetchType.EAGER)
       	public Set<Booking> getBookings(){
                  	return bookings;
       	}
       	
       	public void setBookings(Set<Booking> bookings){
                  	this.bookings = bookings;
       	}

       	
       	
}

