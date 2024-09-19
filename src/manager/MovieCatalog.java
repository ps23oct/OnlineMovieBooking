package manager;

import model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieCatalog {
    private List<Movie> movies;

    public MovieCatalog() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(String movieId) {
        movies.removeIf(movie -> movie.getMovieId().equals(movieId));
    }

    public void displayAllMovies() {
        for (Movie movie : movies) {
            movie.displayMovieDetails();
            System.out.println();
        }
    }

    public List<Movie> getMoviesReleasedInLastSixMonths() {
        return movies.stream()
                .filter(movie -> movie.getReleaseDate().isAfter(LocalDate.now().minusMonths(6)))
                .collect(Collectors.toList());
    }
}