package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    //тест конструкторов - добавление количества последних выводимых фильмов
    @Test
    public void constructorTest() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");
        manager.addMovie("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //тест добавления новых фильмов
    @Test
    public void shouldAddZeroMovies() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFourMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4",};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке (findLast)
    @Test
    public void shouldGetFiveLastMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFourLastMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetSixLastMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
