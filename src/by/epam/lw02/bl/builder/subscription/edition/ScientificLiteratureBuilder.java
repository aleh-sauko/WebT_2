package by.epam.lw02.bl.builder.subscription.edition;

import by.epam.lw02.bl.factory.PrintedEditionFactory;
import by.epam.lw02.dto.constant.EditionType;
import by.epam.lw02.dto.subscription.edition.PrintedEditionDTO;
import by.epam.lw02.dto.subscription.edition.ScientificLiteratureDTO;
import by.epam.lw02.entity.subscription.edition.ScientificLiterature;

/**
 * Created by aleh on 28.03.14.
 */
public class ScientificLiteratureBuilder extends PrintedEditionBuilder {

    @Override
    public void createNewPrintedEdition(PrintedEditionDTO editionDTO) throws ClassCastException {
        super.setEdition(PrintedEditionFactory.createPrintedEdition(EditionType.SCIENTIFIC_LITERATURE));
        buildPrintedEdition(editionDTO);
    }

    @Override
    public void buildPrintedEdition(PrintedEditionDTO editionDTO) throws ClassCastException {
        super.buildPrintedEdition(editionDTO);
        ScientificLiterature scientificLiterature = (ScientificLiterature) super.getEdition();

        scientificLiterature.setDepartment(((ScientificLiteratureDTO) editionDTO).department);
        scientificLiterature.setLevelKnowledge(((ScientificLiteratureDTO) editionDTO).levelKnowledge);
    }
}
