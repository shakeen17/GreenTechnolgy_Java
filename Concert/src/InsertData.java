import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.util.*;
public class InsertData {

    // Event
	public void createEvent(int eventId, String eventName, String desp, int orgId, Timestamp startTimestamp, Timestamp endTimestamp, int venueId, String category, int capacity, int ticketPrice, String status) throws SQLException {
	    // Validate ENUM fields before inserting
	    List<String> validCategories = Arrays.asList("conference", "music concert", "seminar", "workshop");
	    List<String> validStatuses = Arrays.asList("upcoming", "ongoing", "completed", "cancelled");

	    if (!validCategories.contains(category.toLowerCase()) || !validStatuses.contains(status.toLowerCase())) {
	        System.out.println("Error: Invalid category or status.");
	        return;
	    }

	    String query = "INSERT INTO Event (EventID, EventName, Description, OrganizerID, StartDateTime, EndDateTime, VenueID, Category, Capacity, TicketPrice, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
	        ps.setInt(1, eventId);
	        ps.setString(2, eventName);
	        ps.setString(3, desp);
	        ps.setInt(4, orgId);
	        ps.setTimestamp(5, startTimestamp);
	        ps.setTimestamp(6, endTimestamp);
	        ps.setInt(7, venueId);
	        ps.setString(8, category.toLowerCase());
	        ps.setInt(9, capacity);
	        ps.setInt(10, ticketPrice);
	        ps.setString(11, status.toLowerCase());

	        ps.executeUpdate();
	        System.out.println("Data successfully inserted into the Event table!");
	    } catch (SQLException e) {
	        System.out.println("Error executing SQL for Event table: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


    // Venue
    public void createVenue(int venueId, String venueName, String location, int capacity, String vcontactInformation, String description) throws SQLException {
        String query = "INSERT INTO Venue VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, venueId);
            ps.setString(2, venueName);
            ps.setString(3, location);
            ps.setInt(4, capacity);
            ps.setString(5, vcontactInformation);
            ps.setString(6, description);
            
            ps.executeUpdate();
            System.out.println("Data successfully inserted into the Venue table!");
        } catch (SQLException e) {
            System.out.println("Error executing SQL for Venue table: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Schedule
    public void createSchedule(int scheduleId, int eventId, String title, Timestamp startTimestamp, Timestamp endTimestamp, String description, int speakerId) throws SQLException {
        // Check if EventID exists in Event table before inserting
        if (!checkEventExists(eventId)) {
            System.out.println("Error: EventID " + eventId + " does not exist in the Event table.");
            return;
        }

        String query = "INSERT INTO Schedule (ScheduleID, EventID, Title, StartTime, EndTime, Description, SpeakerID) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, scheduleId);
            ps.setInt(2, eventId);
            ps.setString(3, title);
            ps.setTimestamp(4, startTimestamp);
            ps.setTimestamp(5, endTimestamp);
            ps.setString(6, description);
            ps.setInt(7, speakerId);

            ps.executeUpdate();
            System.out.println("Data successfully inserted into the Schedule table!");
        } catch (SQLException e) {
            System.out.println("Error executing SQL for Schedule table: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to check if an Event exists
    private boolean checkEventExists(int eventId) throws SQLException {
        String query = "SELECT COUNT(*) FROM Event WHERE EventID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, eventId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
        return false;
    }


    public void createSpeaker(int speakerId, String fullName, String bio, String photoUrl, String contactInfo, String socialMediaLinks) throws SQLException {
        String query = "INSERT INTO Speaker (SpeakerID, FullName, Bio, PhotoURL, ContactInformation, SocialMediaLinks) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, speakerId);
            ps.setString(2, fullName);
            ps.setString(3, bio);
            ps.setString(4, photoUrl);
            ps.setString(5, contactInfo);
            ps.setString(6, socialMediaLinks);

            ps.executeUpdate();
            System.out.println("Data successfully inserted into the Speaker table!");
        } catch (SQLException e) {
            System.out.println("Error executing SQL for Speaker table: " + e.getMessage());
            e.printStackTrace();
        }
    }


    // Attendee
 // Attendee
    public void registerAttendee(int attendeeId, int userId, int eventId, Date registrationDate, String ticketType, String paymentStatus) throws SQLException {
    	
    	 if (!checkEventExists(eventId)) {
             System.out.println("Error: EventID " + eventId + " does not exist in the Event table.");
             return;
         }
    	
        String query = "INSERT INTO Attendee (AttendeeID, UserID, EventID, RegistrationDate, TicketType, PaymentStatus) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, attendeeId);
            ps.setInt(2, userId);
            ps.setInt(3, eventId);

            // Convert java.util.Date to java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(registrationDate.getTime());
            ps.setDate(4, sqlDate);

            ps.setString(5, ticketType);
            ps.setString(6, paymentStatus);
            
            ps.executeUpdate();
            System.out.println("Data successfully inserted into the Attendee table!");
        } catch (SQLException e) {
            System.out.println("Error executing SQL for Attendee table: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void generateTicket(int eventID, String eventName, String venueName, String speakerName, int attendeeID, String ticketType, int price, String paymentStatus) throws SQLException {
    	String query = "INSERT INTO Ticket (EventID, EventName, VenueName, SpeakerName, AttendeeID, TicketType, Price, PaymentStatus) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    	try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(query)){
    		 pst.setInt(1, eventID);
             pst.setString(2, eventName);
             pst.setString(3, venueName);
             pst.setString(4, speakerName);
             pst.setInt(5, attendeeID);
             pst.setString(6, ticketType);
             pst.setInt(7, price);
             pst.setString(8, paymentStatus);
             
             System.out.println("Data successfully inserted into the Ticket table!");

    	} catch(Exception e) {
    		System.out.println("Error executing SQL for Ticket table: " + e.getMessage());
    		e.printStackTrace();
    	}
    }

}
