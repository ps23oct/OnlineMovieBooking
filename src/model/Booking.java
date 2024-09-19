package model;

import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private LocalDateTime dateTime;
    private Movie movie;
    private User user;

    public Booking(String bookingId, LocalDateTime dateTime, Movie movie, User user) {
        this.bookingId = bookingId;
        this.dateTime = dateTime;
        this.movie = movie;
        this.user = user;
    }

    public String getBookingId() {
        return bookingId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public User getUser() {
        return user;
    }

    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Date and Time: " + dateTime);
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("User: " + user.getName());
    }
}