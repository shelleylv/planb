package hotel.eao.ics;

import hotel.ejb.ics.Booking;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

@Stateless
public class BookingEAOImpl implements BookingEAOLocal {

	@PersistenceContext (unitName="LabEJBSql")
	private EntityManager em;
	
    public BookingEAOImpl() {}

    public Booking findByStartDate (String startDate){
    	return em.find(Booking.class, startDate); 
    }
    
    public Booking findByEndDate (Date endDate){
    	return em.find(Booking.class, endDate);
    }
}