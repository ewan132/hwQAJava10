package ru.netology.FilmManger;

import ru.netology.DomainFilms.Films;

public class FilmManager {

    private Films[] films = new Films[0];
    private int limit;

    public FilmManager() {
        this.limit = 3;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }


    public Films[] findAll() {
        return films;
    }

    public Films[] lastFilm() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        Films[] tmp = new Films[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

}
