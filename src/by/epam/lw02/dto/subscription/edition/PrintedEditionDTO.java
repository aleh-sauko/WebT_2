package by.epam.lw02.dto.subscription.edition;

import by.epam.lw02.dto.TransferObject;

/**
 * Created by aleh on 28.03.14.
 */
public class PrintedEditionDTO extends TransferObject {

    public String name;
    public String material;
    public String language;
    public String author;

    public int countPages;
    public boolean pictured;
    public int yearOfPublication;
}
