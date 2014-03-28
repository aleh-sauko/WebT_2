package by.epam.lw02.bl.builder.subscription;

import by.epam.lw02.bl.builder.subscription.edition.PrintedEditionBuilder;
import by.epam.lw02.bl.builder.subscription.type.SubscriptionTypeBuilder;
import by.epam.lw02.dto.subscription.edition.PrintedEditionDTO;
import by.epam.lw02.dto.subscription.type.SubscriptionTypeDTO;
import by.epam.lw02.entity.subscription.Subscription;

/**
 * Created by aleh on 08.03.14.
 */
public class SubscriptionBuilder {

    private PrintedEditionBuilder editionBuilder;
    private SubscriptionTypeBuilder subscriptionTypeBuilder;

    private Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }

    public void createNewSubscription(PrintedEditionDTO editionDTO, SubscriptionTypeDTO typeDTO) throws ClassCastException {
        subscription = new Subscription();

        editionBuilder.createNewPrintedEdition(editionDTO);
        subscription.setEdition(editionBuilder.getEdition());

        subscriptionTypeBuilder.createNewSubscriptionType(typeDTO);
        subscription.setType(subscriptionTypeBuilder.getType());
    }


    public PrintedEditionBuilder getEditionBuilder() {
        return editionBuilder;
    }

    public void setEditionBuilder(PrintedEditionBuilder editionBuilder) {
        this.editionBuilder = editionBuilder;
    }

    public SubscriptionTypeBuilder getSubscriptionTypeBuilder() {
        return subscriptionTypeBuilder;
    }

    public void setSubscriptionTypeBuilder(SubscriptionTypeBuilder subscriptionTypeBuilder) {
        this.subscriptionTypeBuilder = subscriptionTypeBuilder;
    }
}
