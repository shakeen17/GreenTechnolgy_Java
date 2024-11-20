import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateData {

    // Event
    public void updateEvent(int eventId, String newEventName, String newDescription, Timestamp startTimestamp, Timestamp endTimestamp) throws SQLException {
        String query = "UPDATE Event SET EventName = ?, Description = ?, StartDateTime = ?, EndDateTime = ? WHERE EventID = ?";

        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newEventName);
            ps.setString(2, newDescription);
            ps.setTimestamp(3, startTimestamp);  
            ps.setTimestamp(4, endTimestamp);    
            ps.setInt(5, eventId);            

            ps.executeUpdate();  // Execute the update query
            System.out.println("Event details updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating event: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Venue
    public void updateVenue(int venueId, String newVenueName, String newLocation, int newCapacity, String newContactInformation, String newDescription) throws SQLException {
        String query = "UPDATE Venue SET VenueName = ?, Location = ?, Capacity = ?, ContactInformation = ?, Description = ? WHERE VenueID = ?";

        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newVenueName);
            ps.setString(2, newLocation);
            ps.setInt(3, newCapacity);
            ps.setString(4, newContactInformation);
            ps.setString(5, newDescription);
            ps.setInt(6, venueId);

            ps.executeUpdate();
            System.out.println("Venue details updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating venue: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Schedule
    public void updateSchedule(int scheduleId, int eventId, String newTitle, Timestamp newStartTime, Timestamp newEndTime, String newDescription, int speakerId) throws SQLException {
        String query = "UPDATE Schedule SET Title = ?, StartTime = ?, EndTime = ?, Description = ?, SpeakerID = ? WHERE ScheduleID = ? AND EventID = ?";

        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newTitle);
            ps.setTimestamp(2, newStartTime);
            ps.setTimestamp(3, newEndTime);
            ps.setString(4, newDescription);
            ps.setInt(5, speakerId);
            ps.setInt(6, scheduleId);
            ps.setInt(7, eventId);

            ps.executeUpdate();
            System.out.println("Schedule details updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating schedule: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Speaker
    public void updateSpeaker(int speakerId, String newFullName, String newBio, String newPhotoUrl, String newContactInfo, String newSocialMediaLinks) throws SQLException {
        String query = "UPDATE Speaker SET FullName = ?, Bio = ?, PhotoUrl = ?, ContactInfo = ?, SocialMediaLinks = ? WHERE SpeakerID = ?";

        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newFullName);
            ps.setString(2, newBio);
            ps.setString(3, newPhotoUrl);
            ps.setString(4, newContactInfo);
            ps.setString(5, newSocialMediaLinks);
            ps.setInt(6, speakerId);

            ps.executeUpdate();
            System.out.println("Speaker details updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating speaker: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Attendee
    public void updateAttendee(int attendeeId, int userId, int eventId, String newRegistrationDate, String newTicketType, String newPaymentStatus) throws SQLException {
        String query = "UPDATE Attendee SET UserID = ?, EventID = ?, RegistrationDate = ?, TicketType = ?, PaymentStatus = ? WHERE AttendeeID = ?";

        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, userId);
            ps.setInt(2, eventId);
            ps.setString(3, newRegistrationDate);
            ps.setString(4, newTicketType);
            ps.setString(5, newPaymentStatus);
            ps.setInt(6, attendeeId);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Attendee details updated successfully!");
            } else {
                System.out.println("No attendee found with the given ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating attendee: " + e.getMessage());
            e.printStackTrace();
        }
    }


}
