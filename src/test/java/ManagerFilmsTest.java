import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.DomainFilms.Films;
import ru.netology.FilmManger.FilmManager;

public class ManagerFilmsTest {

    Films film1 = new Films(1, "Бурлеск");
    Films film2 = new Films(2, "Маяк");
    Films film3 = new Films(3, "Солнцестояние");
    Films film4 = new Films(4, "Таксист");


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
    public void lastFilmMinLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);


        Films[] exp = {film2, film1};
        Films[] act = manager.lastFilm();

        Assertions.assertArrayEquals(exp, act);
    }


    @Test
    public void lastFilmEqualLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        Films[] exp = {film3, film2, film1};
        Films[] act = manager.lastFilm();

        Assertions.assertArrayEquals(exp, act);
    }


    @Test
    public void lastFilmOverLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        Films[] exp = {film4, film3, film2};
        Films[] act = manager.lastFilm();

        Assertions.assertArrayEquals(exp, act);

    }


}
