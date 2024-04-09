package ru.netology.services;

public class MovieManager {
    private String[] movies = new String[0];
    private int movieLimit;

    //два конструктора
    public MovieManager() {
        this.movieLimit = 5;
    }

    public MovieManager(int movieLimit) {
        this.movieLimit = movieLimit;
    }

    //добавление нового фильма
    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    //Вывод всех фильмов в порядке добавления (findAll)
    public String[] findAll() {
        return movies;
    }

    //Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке (findLast)-по умолчанию 5, но можно задавать любое число
    public String[] findLast() {
        int moviesLength;
        if (movies.length < movieLimit) {
            moviesLength = movies.length;
        } else {
            moviesLength = movieLimit;
        }
        String[] tmp = new String[moviesLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }

}
