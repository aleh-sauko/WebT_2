package by.epam.lw02.bl.builder.subscription.edition;

import by.epam.lw02.dto.subscription.edition.PrintedEditionDTO;
import by.epam.lw02.entity.subscription.edition.PrintedEdition;

/**
 * Created by aleh on 28.03.14.
 */
public abstract class PrintedEditionBuilder {

    private PrintedEdition edition;

    public PrintedEdition getEdition() {
        return edition;
    }

    protected void setEdition(PrintedEdition edition) {
        this.edition = edition;
    }

    public abstract void createNewPrintedEdition(PrintedEditionDTO editionDTO) throws ClassCastException;
    
    public void buildPrintedEdition(PrintedEditionDTO editionDTO) throws ClassCastException {
        edition.setName(editionDTO.name);
        edition.setAuthor(editionDTO.author);
        edition.setMaterial(editionDTO.material);
        edition.setLanguage(editionDTO.language);
        edition.setCountPages(editionDTO.countPages);
        edition.setPictured(editionDTO.pictured);
    }
}
