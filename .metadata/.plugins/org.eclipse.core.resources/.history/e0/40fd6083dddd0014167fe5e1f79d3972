package hotel.eao.ics;

import java.util.Date;
import java.util.List;

import hotel.ejb.ics.Room;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**              
 * Session Bean implementation class RoomEAO
 */
@Stateless
public class RoomEAOImpl implements RoomEAOLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext (unitName="LabEJBSql")
	private EntityManager em;
	
	public List<Room> findByAvalability(String capacity, String roomType, int price, Date startDate, Date endDate){
		   int cap = Integer.parseInt(capacity);
	    	TypedQuery<Room> r = em.createNamedQuery("Room.findByAvailability", Room.class);
	    	r.setParameter("capacity", cap);
	    	r.setParameter("roomType", roomType);
	    	r.setParameter("price", price);
	    	r.setParameter("startDate", startDate);
	    	r.setParameter("endDate", endDate);
	    	List <Room> rlist = r.getResultList();
	    	return rlist;	
	    }

	
    public RoomEAOImpl() {
        // TODO Auto-generated constructor stub
    }
    
    public Room findByRoomNr (String roomNr){
    	return em.find (Room.class, roomNr);
    }
    
    public List<Room> findByRoomType(String roomType){
    	TypedQuery<Room> r = em.createNamedQuery("Room.findByAvailability", Room.class);
    	r.setParameter("roomType", roomType);
    	List <Room> rlist = r.getResultList();
    	return rlist;	
    }
    
    public List<Room> findByCapacity(int capacity){
    	TypedQuery<Room> r = em.createNamedQuery("Room.findByAvailability", Room.class);
    	r.setParameter("capacity", capacity);
    	List <Room> rlist = r.getResultList();
    	return rlist;	
    }
    
    public List<Room> findByPrice(int price){
    	TypedQuery<Room> r = em.createNamedQuery("Room.findByAvailability", Room.class);
    	r.setParameter("price", price);
    	List <Room> rlist = r.getResultList();
    	return rlist;
    } 


    

}
