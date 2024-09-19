package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private String email;
    private List<Movie> bookedMovies;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.bookedMovies = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Movie> getBookedMovies() {
        return bookedMovies;
    }

    public void bookMovie(Movie movie) {
        bookedMovies.add(movie);
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Booked Movies: ");
        for (Movie movie : bookedMovies) {
            System.out.println(" - " + movie.getTitle());
        }
    }
}