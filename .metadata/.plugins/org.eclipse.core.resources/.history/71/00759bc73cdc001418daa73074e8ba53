package hotel.client.junit.ejb;

import javax.naming.Context;
import javax.naming.InitialContext;

import hotel.eao.ics.RoomEAOLocal;
import hotel.ejb.ics.Room;
import junit.framework.TestCase;

public class BeanTest extends TestCase {
	
	RoomEAOLocal room;

	public BeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		Context context = new InitialContext();
		
		room=(RoomEAOLocal)context.lookup("java:app/Main/RoomEAOImpl!hotel.eao.ics.RoomEAOLocal");
	}

	public void testRoom(){
		Room r = room.findByRoomNr("1002");
		
		assertEquals(r.getRoomType(), "standard");
	}
	protected void tearDown() throws Exception {
		super.tearDown();
		room = null;
	}

}
