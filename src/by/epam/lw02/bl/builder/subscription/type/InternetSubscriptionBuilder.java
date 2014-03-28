package by.epam.lw02.bl.builder.subscription.type;

import by.epam.lw02.bl.factory.SubscriptionTypeFactory;
import by.epam.lw02.dto.constant.SubscriptionKind;
import by.epam.lw02.dto.subscription.type.InternetSubscriptionDTO;
import by.epam.lw02.dto.subscription.type.SubscriptionTypeDTO;
import by.epam.lw02.entity.subscription.type.InternetSubscription;

/**
 * Created by aleh on 28.03.14.
 */
public class InternetSubscriptionBuilder extends SubscriptionTypeBuilder {

    @Override
    public void createNewSubscriptionType(SubscriptionTypeDTO typeDTO) throws ClassCastException {
        super.setType(SubscriptionTypeFactory.createSubscriptionType(SubscriptionKind.INTERNET_SUBSCRIPTION));
        buildSubscriptionType(typeDTO);
    }

    @Override
    public void buildSubscriptionType(SubscriptionTypeDTO typeDTO) throws ClassCastException {
        super.buildSubscriptionType(typeDTO);
        InternetSubscription internet = (InternetSubscription) super.getType();

        InternetSubscriptionDTO internetDTO = (InternetSubscriptionDTO) typeDTO;
        internet.setMail(internetDTO.mail);
        internet.setSource(internetDTO.source);
        internet.setWebPay(internetDTO.webPay);
    }
}
