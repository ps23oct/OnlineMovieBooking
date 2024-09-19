import manager.MovieCatalog;
import manager.UserManager;
import model.Movie;
import model.User;
import model.Booking;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Initialize MovieCatalog and UserManager
        MovieCatalog movieCatalog = new MovieCatalog();
        UserManager userManager = new UserManager();

        // Create movies
        Movie movie1 = new Movie("1", "Avengers", "Action", LocalDate.of(2024, 3, 15), 120, 10);
        Movie movie2 = new Movie("2", "Kapil Sharma Show", "Comedy", LocalDate.of(2024, 6, 10), 90, 5);

        // Add movies to catalog
        movieCatalog.addMovie(movie1);
        movieCatalog.addMovie(movie2);

        // Create users
        User user1 = new User("1", "Prateek", "ps23oct@gmail.com");
        User user2 = new User("2", "Ativ", "ativ@example.com");

        // Add users to manager
        userManager.addUser(user1);
        userManager.addUser(user2);

        // Display available movies
        System.out.println("Available Movies:");
        movieCatalog.displayAllMovies();

        // Book a movie for a user
        try {
            if (movie1.getAvailableSeats() > 0) {
                movie1.decreaseAvailableSeats();
                user1.bookMovie(movie1);
                System.out.println("Booking successful!");
            } else {
                System.out.println("No available seats for the movie.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Display user details and booked movies
        System.out.println("\nUser Details:");
        userManager.displayAllUsers();

        // Display booking details
        Booking booking = new Booking("1", LocalDateTime.now(), movie1, user1);
        System.out.println("\nBooking Details:");
        booking.displayBookingDetails();
    }
}
