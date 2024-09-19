package model;

import java.time.LocalDate;

public class Movie {
    private String movieId;
    private String title;
    private String genre;
    private LocalDate releaseDate;
    private int duration; // in minutes
    private int availableSeats;

    public Movie(String movieId, String title, String genre, LocalDate releaseDate, int duration, int availableSeats) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void decreaseAvailableSeats() {
        if (availableSeats > 0) {
            availableSeats--;
        } else {
            throw new RuntimeException("No available seats.");
        }
    }

    public void displayMovieDetails() {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Available Seats: " + availableSeats);
    }
}