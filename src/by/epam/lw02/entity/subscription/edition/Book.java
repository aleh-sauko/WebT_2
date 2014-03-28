package by.epam.lw02.entity.subscription.edition;

/**
 * Created by aleh on 08.03.14.
 */
public class Book extends PrintedEdition {

    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (genre == null ? 0 : genre.hashCode())*157;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }

        Book o = (Book) obj;
        return (genre == null ? o.genre == null : genre.equals(o.genre));
    }

    @Override
    public String toString() {
        return "Genre : " + genre + "\n" + super.toString();
    }
}
