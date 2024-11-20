import java.sql.*;

public class ViewData {

    // Method to view a single ticket by ticket ID
    public void viewTicket(int ticketId) throws SQLException {
        String query = "SELECT * FROM Ticket WHERE TicketID = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, ticketId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Ticket ID: " + rs.getInt("TicketID"));
                    System.out.println("Event Name: " + rs.getString("EventName"));
                    System.out.println("Ticket Type: " + rs.getString("TicketType"));
                    System.out.println("Payment Status: " + rs.getString("PaymentStatus"));
                } else {
                    System.out.println("No ticket found with ID: " + ticketId);
                }
            }
        }
    }

    // Method to view event details by event ID
    public void viewEvent(int eventId) throws SQLException {
        String query = "SELECT * FROM Event WHERE EventID = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, eventId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Event ID: " + rs.getInt("EventID"));
                    System.out.println("Event Name: " + rs.getString("EventName"));
                    System.out.println("Description: " + rs.getString("Description"));
                    System.out.println("Start DateTime: " + rs.getTimestamp("StartDateTime"));
                    System.out.println("End DateTime: " + rs.getTimestamp("EndDateTime"));
                    System.out.println("Category: " + rs.getString("Category"));
                    System.out.println("Status: " + rs.getString("Status"));
                    System.out.println("Capacity: " + rs.getInt("Capacity"));
                    System.out.println("Ticket Price: " + rs.getInt("TicketPrice"));
                } else {
                    System.out.println("No event found with ID: " + eventId);
                }
            }
        }
    }

    // Method to view all events in the database
    public void viewEntireEvents() throws SQLException {
        String query = "SELECT * FROM Event";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pst = conn.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println("Event ID: " + rs.getInt("EventID"));
                System.out.println("Event Name: " + rs.getString("EventName"));
                System.out.println("Description: " + rs.getString("Description"));
                System.out.println("Organizer ID: " + rs.getInt("OrganizerID"));
                System.out.println("Start DateTime: " + rs.getTimestamp("StartDateTime"));
                System.out.println("End DateTime: " + rs.getTimestamp("EndDateTime"));
                System.out.println("Category: " + rs.getString("Category"));
                System.out.println("Status: " + rs.getString("Status"));
                System.out.println("Capacity: " + rs.getInt("Capacity"));
                System.out.println("Ticket Price: " + rs.getInt("TicketPrice"));
                System.out.println();
            }
        }
    }
}
