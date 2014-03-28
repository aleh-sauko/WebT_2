package by.epam.lw02.bl.factory;

import by.epam.lw02.dto.constant.SubscriptionKind;
import by.epam.lw02.entity.subscription.type.InternetSubscription;
import by.epam.lw02.entity.subscription.type.MailSubscription;
import by.epam.lw02.entity.subscription.type.SubscriptionType;

/**
 * Created by aleh on 08.03.14.
 */
public final class SubscriptionTypeFactory {

    private SubscriptionTypeFactory() {}

    public static SubscriptionType createSubscriptionType(SubscriptionKind type) {
        SubscriptionType subscriptionType = null;
        switch (type) {
            case MAIL_SUBSCRIPTION:
                subscriptionType = new MailSubscription();
                break;
            case INTERNET_SUBSCRIPTION:
                subscriptionType = new InternetSubscription();
                break;
        }
        return subscriptionType;
    }

}
