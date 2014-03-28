package by.epam.lw02.bl.builder.subscription.edition;

import by.epam.lw02.bl.factory.PrintedEditionFactory;
import by.epam.lw02.dto.constant.EditionType;
import by.epam.lw02.dto.subscription.edition.JournalDTO;
import by.epam.lw02.dto.subscription.edition.PrintedEditionDTO;
import by.epam.lw02.entity.subscription.edition.Journal;

/**
 * Created by aleh on 28.03.14.
 */
public class JournalBuilder extends PrintedEditionBuilder {

    @Override
    public void createNewPrintedEdition(PrintedEditionDTO editionDTO) throws ClassCastException {
        super.setEdition(PrintedEditionFactory.createPrintedEdition(EditionType.JOURNAL));
        buildPrintedEdition(editionDTO);
    }

    @Override
    public void buildPrintedEdition(PrintedEditionDTO editionDTO) throws ClassCastException {
        super.buildPrintedEdition(editionDTO);
        Journal journal = (Journal) super.getEdition();
        journal.setPeriodicity(((JournalDTO) editionDTO).periodicity);
        journal.setForWhom(((JournalDTO) editionDTO).forWhom);
    }
}
