import java.sql.*;

public class DeleteData {

    // Event
    public void deleteEvent(int eventId) throws SQLException {
        // Step 1: Delete dependent records in Schedule table (both EventID and SpeakerID)
        String deleteScheduleQuery = "DELETE FROM Schedule WHERE EventID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(deleteScheduleQuery)) {
            pst.setInt(1, eventId);
            pst.executeUpdate();
        }
        
        // Step 2: Delete the event record from the Event table (after schedules are deleted)
        String deleteAttendeequery = "DELETE FROM ATTENDEE WHERE AttendeeID = ?";
        try(Connection conn = DatabaseUtil.getConnection();PreparedStatement pst = conn.prepareStatement(deleteAttendeequery)){
        	pst.setInt(1,eventId);
        	pst.executeUpdate();
        }

        // Step 3: Delete the event record from the Event table (after schedules are deleted)
        String query = "DELETE FROM Event WHERE EventID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, eventId);
            pst.executeUpdate();
        }

        System.out.println("Event and related schedule & attendee deleted successfully.");
    }

    // Venue
    public void deleteVenue(int venueId) throws SQLException {
        // Before deleting the venue, check if any event references this venue (foreign key constraint).
        // If there are any events referencing the venue, you can either delete them or update their venue reference.

        String query = "DELETE FROM Venue WHERE VenueID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, venueId);
            pst.executeUpdate();
        }
    }

    // Schedule
    public void deleteSchedule(int scheduleId) throws SQLException {
        String query = "DELETE FROM Schedule WHERE ScheduleID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, scheduleId);
            pst.executeUpdate();
        }
    }

    // Speaker
    public void deleteSpeaker(int speakerId) throws SQLException {
        // First, check if the speaker is associated with any schedules
        String deleteScheduleQuery = "DELETE FROM Schedule WHERE SpeakerID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(deleteScheduleQuery)) {
            pst.setInt(1, speakerId);
            pst.executeUpdate();
        }

        // Now, delete the speaker record
        String query = "DELETE FROM Speaker WHERE SpeakerID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, speakerId);
            pst.executeUpdate();
        }
    }

    // Attendee
    public void deleteAttendee(int attendeeId) throws SQLException {
        String query = "DELETE FROM Attendee WHERE AttendeeID = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setInt(1, attendeeId);
            pst.executeUpdate();
        }
    }
}
