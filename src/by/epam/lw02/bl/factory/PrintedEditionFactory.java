package by.epam.lw02.bl.factory;

import by.epam.lw02.dto.constant.EditionType;
import by.epam.lw02.entity.subscription.edition.Book;
import by.epam.lw02.entity.subscription.edition.Journal;
import by.epam.lw02.entity.subscription.edition.PrintedEdition;
import by.epam.lw02.entity.subscription.edition.ScientificLiterature;

/**
 * Created by aleh on 08.03.14.
 */
public final class PrintedEditionFactory {

    private PrintedEditionFactory() {}

    public static PrintedEdition createPrintedEdition(EditionType type) {
        PrintedEdition edition = null;
        switch (type) {
            case BOOK:
                edition = new Book();
                break;
            case JOURNAL:
                edition = new Journal();
                break;
            case SCIENTIFIC_LITERATURE:
                edition = new ScientificLiterature();
                break;
        }
        return edition;
    }
}
