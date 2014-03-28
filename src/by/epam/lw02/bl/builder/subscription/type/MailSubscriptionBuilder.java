package by.epam.lw02.bl.builder.subscription.type;

import by.epam.lw02.bl.factory.SubscriptionTypeFactory;
import by.epam.lw02.dto.constant.SubscriptionKind;
import by.epam.lw02.dto.subscription.type.MailSubscriptionDTO;
import by.epam.lw02.dto.subscription.type.SubscriptionTypeDTO;
import by.epam.lw02.entity.subscription.type.MailSubscription;

/**
 * Created by aleh on 28.03.14.
 */
public class MailSubscriptionBuilder extends SubscriptionTypeBuilder {

    @Override
    public void createNewSubscriptionType(SubscriptionTypeDTO typeDTO) throws ClassCastException {
        super.setType(SubscriptionTypeFactory.createSubscriptionType(SubscriptionKind.MAIL_SUBSCRIPTION));
        buildSubscriptionType(typeDTO);
    }

    @Override
    public void buildSubscriptionType(SubscriptionTypeDTO typeDTO) throws ClassCastException {
        super.buildSubscriptionType(typeDTO);
        MailSubscription mail = (MailSubscription) super.getType();

        MailSubscriptionDTO mailDTO = (MailSubscriptionDTO) typeDTO;
        mail.setAddress(mailDTO.address);
        mail.setCity(mailDTO.city);
        mail.setCountry(mailDTO.country);
    }
}
