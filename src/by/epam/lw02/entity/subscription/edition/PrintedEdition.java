package by.epam.lw02.entity.subscription.edition;


import by.epam.lw02.entity.subscription.PartOfSubscription;

/**
 * Created by aleh on 08.03.14.
 */
public abstract class PrintedEdition extends PartOfSubscription {

    private String name;
    private String material;
    private String language;
    private String author;

    private int countPages;
    private boolean pictured;
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public boolean isPictured() {
        return pictured;
    }

    public void setPictured(boolean pictured) {
        this.pictured = pictured;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrintedEdition o = (PrintedEdition) obj;
        return (name == null ? o.name == null : name.equals(o.name)) &&
                (material == null ? o.material == null : material.equals(o.material)) &&
                (language == null ? o.language == null : language.equals(o.language)) &&
                (author == null ? o.author == null : author.equals(o.author)) &&
                countPages == o.countPages && pictured == o.pictured &&
                yearOfPublication == o.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return (name == null ? 0 : name.hashCode())*31 +
                (material == null ? 0 : material.hashCode())*7 +
                (language == null ? 0 : language.hashCode())*43 +
                (author == null ? 0 : author.hashCode())*113 +
                (pictured ? 10021 : 0) + yearOfPublication*143 + countPages;
    }

    @Override
    public String toString() {
        return getClass() + "\nName : " + name + "\nAuthor : " + author + "\nLanguage : " + language +
                "\nMaterial : " + material + "\nPictured : " + pictured +
                "\nCount of Pages : " + countPages + "\nYear of publication : " + yearOfPublication;
    }
}
