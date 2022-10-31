package ru.netology.javaqa;

public class FilmManager {
    private AddingMovies[] items = new AddingMovies[0];
    private int limit = 3;
    public FilmManager() {
    }
    public FilmManager(int limit) {
        this.limit = limit;

    }

    public void save(AddingMovies item) {
        int length = items.length + 1;
        AddingMovies[] tmp = new AddingMovies[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public AddingMovies[] findAll() {return items;}


    public AddingMovies[] findLast() {
        if (limit < items.length) {
            AddingMovies[] result = new  AddingMovies[limit];
            for ( int i = 0; i < result.length; i++) {
                int index = items.length - i -1;
                result[i] = items[index];
            }
            return result;
        } else {
            AddingMovies[] result = new AddingMovies[items.length];
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;

        }
    }

}


