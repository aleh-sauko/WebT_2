package by.epam.lw02.bl.builder.subscription.edition;

import by.epam.lw02.bl.factory.PrintedEditionFactory;
import by.epam.lw02.dto.constant.EditionType;
import by.epam.lw02.dto.subscription.edition.BookDTO;
import by.epam.lw02.dto.subscription.edition.PrintedEditionDTO;
import by.epam.lw02.entity.subscription.edition.Book;

/**
 * Created by aleh on 28.03.14.
 */
public class BookBuilder extends PrintedEditionBuilder {

    @Override
    public void createNewPrintedEdition(PrintedEditionDTO editionDTO) {
        super.setEdition(PrintedEditionFactory.createPrintedEdition(EditionType.BOOK));
        buildPrintedEdition(editionDTO);
    }

    @Override
    public void buildPrintedEdition(PrintedEditionDTO editionDTO) {
        super.buildPrintedEdition(editionDTO);
        Book book = (Book) super.getEdition();
        book.setGenre(((BookDTO)editionDTO).genre);
    }
}
