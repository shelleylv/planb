package hotel.client.ics;

import hotel.ejb.ics.Room;
import hotel.facade.ics.FacadeLocal;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	FacadeLocal facade;
    public MainServlet() {
        super();

    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String s = request.getParameter("vad"); /// s = findRooms
		
		if(s.equals("findRooms")){
			
			//String roomNumber = request.getParameter("rumsNummer"); /// s = findRooms

			
			Room r = facade.findByRoomNr("1002");
			
			
			request.setAttribute("rummet", r);
			
			RequestDispatcher dispatcher =
					getServletContext().getRequestDispatcher("Booking.jsp");
					dispatcher.forward(request, response);
			
		}
		else if(s.equals("deletePerson")){
			
		}*/
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = null;
		String s = request.getParameter("operation");
		
		if(s.equals("findRooms")){
			System.out.println("FIIIIIIIINDROOOMS"
					);
			String capacity = request.getParameter("capacity");
			String roomType = request.getParameter("roomType");
			String price = request.getParameter("price");
			int intPrice = Integer.parseInt(price);
			String start = request.getParameter("startDateField");
			
			String end = request.getParameter("endDateField");
			
			System.out.println(capacity);
			System.out.println(roomType);
			System.out.println(intPrice);
			System.out.println(start);
			System.out.println(end);

			
			
			
			//int syear = Integer.parseInt(start.substring(start.length()-4));
			//String stemp = start.substring(3, 6);
			//int smonth = giveIntFromMonthString(stemp);
			//int sday = Integer.parseInt(start.substring(0, 2));
			//Date startDate = new Date(syear, smonth, sday);
			//System.out.println(syear +" " + smonth + " " + sday);
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
			Date startDate = new Date();
			try {
				startDate = formatter.parse(start);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			/*int eyear = Integer.parseInt(end.substring(end.length()-4));
			String etemp = start.substring(3, 6);
			int emonth = giveIntFromMonthString(stemp);
			int eday = Integer.parseInt(start.substring(0, 2));
			Date endDate = new Date(eyear, emonth, eday);*/
			Date endDate = new Date();
			try {
				endDate = formatter.parse(end);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			List<Room> listRoom = facade.findByAvalability(capacity, roomType, intPrice, startDate, endDate);
			
	
			
			request.setAttribute("availableRooms", listRoom);
			url = "/Booking.jsp";
		}
		

		RequestDispatcher dispatcher =
				getServletContext().getRequestDispatcher(url);
				dispatcher.forward(request, response);
		
	}
	/*public int giveIntFromMonthString(String month){
		if(month.equals("JAN")){
			return 1;
		} else if(month.equals("FEB")){
			return 2;
		}else if(month.equals("MAR")){
			return  3;
		}else if(month.equals("APR")){
			return  4;
		}else if(month.equals("MAY")){
			return 5;
		}else if(month.equals("JUN")){
			return 6;
		}else if(month.equals("JUL")){
			return 7;
		}else if(month.equals("AUG")){
			return 8;
		}else if(month.equals("SEP")){
			return 9;
		}else if(month.equals("OCT")){
			return 10;
		}else if(month.equals("NOV")){
			return 11;
		}else if(month.equals("DEC")){
			return 12;
		}
		return 0;
	}*/
}

