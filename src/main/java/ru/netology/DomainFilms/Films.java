package ru.netology.DomainFilms;

public class Films {
    private int id;
    private String nameFilm;

    public int getId() {
        return id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public Films(int id, String nameFilm) {
        this.id = id;
        this.nameFilm = nameFilm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }
}
