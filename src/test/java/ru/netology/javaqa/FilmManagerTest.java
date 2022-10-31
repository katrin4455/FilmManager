package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();
    AddingMovies first = new AddingMovies("Бладшот");
    AddingMovies second = new AddingMovies("Вперед");
    AddingMovies third = new AddingMovies("Отель Белград");
    AddingMovies fourth = new AddingMovies("Джентельмены");
    AddingMovies fifth = new AddingMovies("Человек-невидимка");
    AddingMovies sixth = new AddingMovies("Тролли.Мировой тур");
    AddingMovies seventh = new AddingMovies("Номер один");
    AddingMovies eighth = new AddingMovies("Гарри Поттер");
    AddingMovies ninth = new AddingMovies("Смешарики");
    AddingMovies tenth = new AddingMovies("Горы");



    @Test
    public void storage() {
        manager.save(first);
        manager.save(second);
        // manager.save(third);
        // manager.save(fourth);
        //manager.save(fifth);

        manager.save(third);

        AddingMovies[] actual = manager.findAll();
        AddingMovies[] expected = {first, second, third};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLast() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        //manager.save(fourth);
        // manager.save(fifth);
        // manager.save(sixth);
        //  manager.save(seventh);
        //  manager.save(eighth);
        // manager.save(ninth);
        // manager.save(tenth);

        AddingMovies[] actual = manager.findLast();
        AddingMovies[] expected = { third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast1() {
        FilmManager manager = new FilmManager(3);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);

        AddingMovies[] actual = manager.findLast();
        AddingMovies[] expected = {fifth, fourth, third};

        Assertions.assertArrayEquals(expected, actual);

    }

}

