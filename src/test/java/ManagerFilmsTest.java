import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.DomainFilms.Films;
import ru.netology.FilmManger.FilmManager;

public class ManagerFilmsTest {


    FilmManager manager = new FilmManager();
    Films film1 = new Films(1, "Бурлеск");
    Films film2 = new Films(2, "Маяк");
    Films film3 = new Films(3, "Солнцестояние");
/*
    @BeforeEach
    public void setup(){
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

    } */


    @Test
    public void findAll() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        Films[] exp = {film1, film2, film3};
        Films[] act = manager.findAll();

        Assertions.assertArrayEquals(exp, act);
    }


    @Test
    public void lastFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        Films[] exp = {film3, film2, film1};
        Films[] act = manager.lastFilm();

        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void lastFilmMinLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);


        Films[] exp = {film2, film1};
        Films[] act = manager.lastFilm();

        Assertions.assertArrayEquals(exp, act);
    }


}
