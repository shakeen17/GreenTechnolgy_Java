import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws SQLException {
        // Create InsertData object
        InsertData insert = new InsertData();
        UpdateData update = new UpdateData();
        DeleteData delete = new DeleteData();
        ViewData view = new ViewData();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your role (1. Event Manager, 2. Customer, 3.View Avabile Events):");
        int role = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (role == 1) {
            System.out.println("Enter a choice (1. Insert, 2. Update, 3. Delete):");
            int ch = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (ch) {
                case 1 -> {
                    System.out.println("Insert selected.....");

                    // Step 1: Insert Venue Data
                    System.out.println("\n..........Values for Venue table..........");
                    System.out.print("Enter VenueID: ");
                    int venueID = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Venue Name: ");
                    String venueName = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Venue Capacity: ");
                    int venueCapacity = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Contact Information: ");
                    String venueContactInformation = sc.nextLine();

                    System.out.print("Enter Venue Description: ");
                    String venueDescription = sc.nextLine();

                    // Insert Venue data
                    try {
                        insert.createVenue(venueID, venueName, location, venueCapacity, venueContactInformation, venueDescription);
                        System.out.println("Venue inserted successfully!");
                    } catch (Exception e) {
                        System.out.println("Error inserting Venue: " + e.getMessage());
                        return;
                    }

                    // Step 2: Insert Speaker Data (before Schedule)
                    System.out.println("\n..........Values for Speaker table..........");
                    System.out.print("Enter SpeakerID: ");
                    int speakerID = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Speaker Full Name: ");
                    String fullName = sc.nextLine();

                    System.out.print("Enter Bio: ");
                    String bio = sc.nextLine();

                    System.out.print("Enter Photo URL: ");
                    String photoURL = sc.nextLine();

                    System.out.print("Enter Speaker Contact Information: ");
                    String speakerContactInformation = sc.nextLine();

                    System.out.print("Enter Social Media Links: ");
                    String socialMediaLinks = sc.nextLine();

                    // Insert Speaker data
                    try {
                        insert.createSpeaker(speakerID, fullName, bio, photoURL, speakerContactInformation, socialMediaLinks);
                        System.out.println("Speaker inserted successfully!");
                    } catch (Exception e) {
                        System.out.println("Error inserting Speaker: " + e.getMessage());
                        return;
                    }

                    // Step 3: Insert Event Data
                    System.out.println("\n..........Values for Event table..........");
                    System.out.print("Enter EventID: ");
                    int eventID = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Event Name: ");
                    String eventName = sc.nextLine();

                    System.out.print("Enter Event Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter OrganizerID: ");
                    int organizerID = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Start DateTime (YYYY-MM-DD HH:MM:SS): ");
                    String startDateTime = sc.nextLine();

                    System.out.print("Enter End DateTime (YYYY-MM-DD HH:MM:SS): ");
                    String endDateTime = sc.nextLine();

                    System.out.print("Enter Event Category (conference, music concert, seminar, workshop): ");
                    String category = sc.nextLine();

                    System.out.print("Enter Event Capacity: ");
                    int eventCapacity = sc.nextInt();

                    System.out.print("Enter Ticket Price: ");
                    int ticketPrice = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Event Status (upcoming, ongoing, completed, cancelled): ");
                    String status = sc.nextLine();

                    // Convert string date-time to Timestamp
                    Timestamp startTimestamp = convertStringToTimestamp(startDateTime);
                    Timestamp endTimestamp = convertStringToTimestamp(endDateTime);

                    if (startTimestamp == null || endTimestamp == null) {
                        System.out.println("Invalid date format. Insertion aborted.");
                        return;
                    }

                    // Insert Event data
                    boolean isEventInserted = false;
                    try {
                        insert.createEvent(eventID, eventName, description, organizerID, startTimestamp, endTimestamp, venueID, category, eventCapacity, ticketPrice, status);
                        System.out.println("Event inserted successfully!");
                        isEventInserted = true;
                    } catch (Exception e) {
                        System.out.println("Error inserting Event: " + e.getMessage());
                    }

                    // Check if Event insertion was successful
                    if (!isEventInserted) {
                        System.out.println("Event insertion failed. Aborting schedule insertion.");
                        return; // Exit if event insertion fails
                    }

                    // Step 4: Insert Schedule Data (after Event and Speaker)
                    System.out.println("\n..........Values for Schedule table..........");
                    System.out.print("Enter ScheduleID: ");
                    int scheduleID = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Schedule Title: ");
                    String title = sc.nextLine();

                    // Insert Schedule data
                    try {
                        insert.createSchedule(scheduleID, eventID, title, startTimestamp, endTimestamp, description, speakerID);
                        System.out.println("Schedule inserted successfully!");
                    } catch (Exception e) {
                        System.out.println("Error inserting Schedule: " + e.getMessage());
                    }
                }
                
                case 2 -> {
                    System.out.println("Which table would you like to update? (1. Event 2. Venue 3. Schedule 4. Speaker 5. Attendee):");
                    int tableChoice = sc.nextInt();
                    
                    switch (tableChoice) {
                        case 1: {
                            // Update Event
                            System.out.println("Enter Event ID to update:");
                            int eventId = sc.nextInt();
                            
                            // Get other input details
                            System.out.println("Enter new Event Name:");
                            sc.nextLine();  // Consume the leftover newline
                            String newEventName = sc.nextLine();
                            
                            System.out.println("Enter new Description:");
                            String newDescription = sc.nextLine();
                            
                            System.out.println("Enter Start Date and Time (yyyy-MM-dd HH:mm:ss):");
                            String startDateTimeStr = sc.nextLine();
                            Timestamp startTimestamp = Timestamp.valueOf(startDateTimeStr);
                            
                            System.out.println("Enter End Date and Time (yyyy-MM-dd HH:mm:ss):");
                            String endDateTimeStr = sc.nextLine();
                            Timestamp endTimestamp = Timestamp.valueOf(endDateTimeStr);
                            
                            // Call the update method
                            try {
                                update.updateEvent(eventId, newEventName, newDescription, startTimestamp, endTimestamp);
                                System.out.println("Event updated successfully!");
                            } catch (Exception e) {
                                System.out.println("Error updating Event: " + e.getMessage());
                            }
                            break;
                        }
                        case 2: {
                            // Update Venue
                            System.out.println("Enter Venue ID to update:");
                            int venueId = sc.nextInt();
                            
                            // Get other input details
                            System.out.println("Enter new Venue Name:");
                            sc.nextLine();  // Consume the leftover newline
                            String newVenueName = sc.nextLine();
                            
                            System.out.println("Enter new Location:");
                            String newLocation = sc.nextLine();
                            
                            System.out.println("Enter new Capacity:");
                            int newCapacity = sc.nextInt();
                            
                            System.out.println("Enter new Contact Information:");
                            sc.nextLine();  // Consume the leftover newline
                            String newContactInfo = sc.nextLine();
                            
                            System.out.println("Enter new Description:");
                            String newDescription = sc.nextLine();
                            
                            // Call the update method
                            try {
                                update.updateVenue(venueId, newVenueName, newLocation, newCapacity, newContactInfo, newDescription);
                                System.out.println("Venue updated successfully!");
                            } catch (Exception e) {
                                System.out.println("Error updating Venue: " + e.getMessage());
                            }
                            break;
                        }
                        case 3: {
                            // Update Schedule
                            System.out.println("Enter Schedule ID to update:");
                            int scheduleId = sc.nextInt();
                            
                            System.out.println("Enter Event ID for the Schedule:");
                            int eventId = sc.nextInt();
                            
                            // Get other input details
                            System.out.println("Enter new Schedule Title:");
                            sc.nextLine();  // Consume the leftover newline
                            String newTitle = sc.nextLine();
                            
                            System.out.println("Enter new Start Time (yyyy-MM-dd HH:mm:ss):");
                            String startTimeStr = sc.nextLine();
                            Timestamp startTime = Timestamp.valueOf(startTimeStr);
                            
                            System.out.println("Enter new End Time (yyyy-MM-dd HH:mm:ss):");
                            String endTimeStr = sc.nextLine();
                            Timestamp endTime = Timestamp.valueOf(endTimeStr);
                            
                            System.out.println("Enter new Description:");
                            String newDescription = sc.nextLine();
                            
                            System.out.println("Enter Speaker ID:");
                            int speakerId = sc.nextInt();
                            
                            // Call the update method
                            try {
                                update.updateSchedule(scheduleId, eventId, newTitle, startTime, endTime, newDescription, speakerId);
                                System.out.println("Schedule updated successfully!");
                            } catch (Exception e) {
                                System.out.println("Error updating Schedule: " + e.getMessage());
                            }
                            break;
                        }
                        case 4: {
                            // Update Speaker
                            System.out.println("Enter Speaker ID to update:");
                            int speakerId = sc.nextInt();
                            
                            // Get other input details
                            System.out.println("Enter new Full Name:");
                            sc.nextLine();  // Consume the leftover newline
                            String newFullName = sc.nextLine();
                            
                            System.out.println("Enter new Bio:");
                            String newBio = sc.nextLine();
                            
                            System.out.println("Enter new Photo URL:");
                            String newPhotoUrl = sc.nextLine();
                            
                            System.out.println("Enter new Contact Info:");
                            String newContactInfo = sc.nextLine();
                            
                            System.out.println("Enter new Social Media Links:");
                            String newSocialMediaLinks = sc.nextLine();
                            
                            // Call the update method
                            try {
                                update.updateSpeaker(speakerId, newFullName, newBio, newPhotoUrl, newContactInfo, newSocialMediaLinks);
                                System.out.println("Speaker updated successfully!");
                            } catch (Exception e) {
                                System.out.println("Error updating Speaker: " + e.getMessage());
                            }
                            break;
                        }
                        
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;
                }
                
                case 3 -> {
                    System.out.println("Choice Which table to be deleted (1.Event 2.Venue 3.Schedule 4.Speaker):");
                    int opt = sc.nextInt();
                    switch(opt) {
                        case 1:
                            System.out.println("Enter EventID:");
                            int eventId = sc.nextInt();
                            try {
                                delete.deleteEvent(eventId);
                                System.out.println("Event Deleted successfully...");
                            } catch (Exception e) {
                                System.out.println("Error deleting Event: " + e.getMessage());
                            }
                            break;
                        
                        case 2:
                            System.out.println("Enter VenueID:");
                            int venueId = sc.nextInt();
                            try {
                                delete.deleteVenue(venueId);
                                System.out.println("Venue Deleted successfully...");
                            } catch (Exception e) {
                                System.out.println("Error deleting Venue: " + e.getMessage());
                            }
                            break;

                        case 3:
                            System.out.println("Enter ScheduleID:");
                            int scheduleId = sc.nextInt();
                            try {
                                delete.deleteSchedule(scheduleId);
                                System.out.println("Schedule Deleted successfully...");
                            } catch (Exception e) {
                                System.out.println("Error deleting Schedule: " + e.getMessage());
                            }
                            break;

                        case 4:
                            System.out.println("Enter SpeakerID:");
                            int speakerId = sc.nextInt();
                            try {
                                delete.deleteSpeaker(speakerId);
                                System.out.println("Speaker Deleted successfully...");
                            } catch (Exception e) {
                                System.out.println("Error deleting Speaker: " + e.getMessage());
                            }
                            break;


                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                }

                default -> System.out.println("Invalid choice.");
            }
        }
        else if (role == 2) {
            System.out.println("Enter the Choice (1. Book Slot, 2. View Ticket 3.Cancelation):");
            int decide = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (decide) {
                case 1 -> {
                    System.out.println("\n..........Values for Attendee table..........");

                    // Step 1: Get Attendee ID
                    System.out.print("Enter Attendee ID: ");
                    int attendeeId = sc.nextInt();
                    
                    //Event id to check event is avaliable or not
                    System.out.print("Enter Event ID: ");
                    int EventId = sc.nextInt();
                    

                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    // Step 2: Get Registration Date
                    System.out.print("Enter Registration Date (yyyy-MM-dd): ");
                    String registrationDate = sc.nextLine();

                    // Validate date format
                    if (!isValidDateFormat(registrationDate)) {
                        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                        break;
                    }

                    // Convert String to java.util.Date
                    Date registrationDateObj = convertStringToDate(registrationDate);
                    if (registrationDateObj == null) {
                        System.out.println("Error converting date. Please check the format.");
                        break;
                    }

                    // Step 3: Get Ticket Type
                    System.out.print("Enter Ticket Type ('general', 'vip', 'premium', 'diamond'): ");
                    String ticketType = sc.nextLine();
                    if (!ticketType.matches("general|vip|premium|diamond")) {
                        System.out.println("Invalid ticket type. Please choose from 'general', 'vip', 'premium', or 'diamond'.");
                        break;
                    }

                    // Step 4: Get Payment Status
                    System.out.print("Enter Payment Status ('pending', 'paid', 'refunded'): ");
                    String paymentStatus = sc.nextLine();
                    if (!paymentStatus.matches("pending|paid|refunded")) {
                        System.out.println("Invalid payment status. Please choose from 'pending', 'paid', or 'refunded'.");
                        break;
                    }

                    // Step 5: Insert Attendee data into the database
                    try {
                        insert.registerAttendee(attendeeId, userId,EventId, registrationDateObj, ticketType, paymentStatus);
                        //insert.generateTicket(EventId, eventName, paymentStatus, registrationDate, attendeeId, ticketType, role, paymentStatus);
                        System.out.println("Slot booked successfully!");
                    } catch (Exception e) {
                        System.out.println("Error booking slot: " + e.getMessage());
                    }
                }
                case 2 -> {
                    // Case 2: View Ticket (This part can be implemented as needed)
                    System.out.println("Viewing ticket functionality is under development.");
                }
                case 3 -> {
                	System.out.println("Enter the AttendeeID to delete:");
                	int attendeeID = sc.nextInt();
                    try {
                        delete.deleteAttendee(attendeeID);
                        System.out.println("Attendee Deleted successfully...");
                    } catch (Exception e) {
                        System.out.println("Error deleting Attendee: " + e.getMessage());
                    }
                    break;
                	
                }

                default -> System.out.println("Invalid choice.");
            }
        }
        
        else if(role == 3) {
        	System.out.println("1.Display all Events, 2.Display Specific Event");
        	int dis = sc.nextInt();
        	
        	switch(dis) {
        	case 1 -> view.viewEntireEvents();
        	case 2 -> {
        		System.out.println("Enter EventID:");
        		int eveId = sc.nextInt();
        		view.viewEvent(eveId);
        	}
        	}
        }

        sc.close();

    }
    
    
    

    // Helper method to convert String to Timestamp
    public static Timestamp convertStringToTimestamp(String dateTime) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parsedDate = dateFormat.parse(dateTime);
            return new Timestamp(parsedDate.getTime());
        } catch (Exception e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }
    
 // Helper method to convert String to java.util.Date
    public static Date convertStringToDate(String dateStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false); // Disable lenient parsing
            return sdf.parse(dateStr);
        } catch (Exception e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }

 // Validate date format
    private static boolean isValidDateFormat(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false); // Disable lenient parsing
            sdf.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }



    
}
