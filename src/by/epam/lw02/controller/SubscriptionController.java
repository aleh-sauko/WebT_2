package by.epam.lw02.controller;

import by.epam.lw02.bl.builder.subscription.SubscriptionBuilder;
import by.epam.lw02.bl.builder.subscription.edition.JournalBuilder;
import by.epam.lw02.bl.builder.subscription.edition.ScientificLiteratureBuilder;
import by.epam.lw02.bl.builder.subscription.type.InternetSubscriptionBuilder;
import by.epam.lw02.bl.builder.subscription.type.MailSubscriptionBuilder;
import by.epam.lw02.dto.subscription.edition.PrintedEditionDTO;
import by.epam.lw02.dto.subscription.type.SubscriptionTypeDTO;
import by.epam.lw02.entity.subscription.Subscription;

/**
 * Created by aleh on 08.03.14.
 */
public final class SubscriptionController {

    private static SubscriptionController instance;
    private static SubscriptionBuilder builder;

    public static SubscriptionController getInstance() {
        if (instance == null) {
            synchronized (SubscriptionController.class) {
                if (instance == null) {
                    instance = new SubscriptionController();
                }
            }
        }
        return instance;
    }

    public static void createLiveHackBuilder() {
        builder = new SubscriptionBuilder();
        builder.setEditionBuilder(new JournalBuilder());
        builder.setSubscriptionTypeBuilder(new MailSubscriptionBuilder());
    }

    public static void createHackerBuilder() {
        builder = new SubscriptionBuilder();
        builder.setEditionBuilder(new ScientificLiteratureBuilder());
        builder.setSubscriptionTypeBuilder(new InternetSubscriptionBuilder());
    }

    public static void createNewSubscription(PrintedEditionDTO editionDTO, SubscriptionTypeDTO typeDTO)
            throws NoBuilderException, ClassCastException {
        if (builder == null) {
            throw new NoBuilderException();
        }
        builder.createNewSubscription(editionDTO, typeDTO);
    }

    public static Subscription getSubscription() throws NoBuilderException {
        if (builder == null) {
            throw new NoBuilderException();
        }

        return builder.getSubscription();
    }
}
