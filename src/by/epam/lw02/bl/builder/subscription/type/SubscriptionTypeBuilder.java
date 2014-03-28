package by.epam.lw02.bl.builder.subscription.type;

import by.epam.lw02.dto.subscription.type.SubscriptionTypeDTO;
import by.epam.lw02.entity.subscription.type.SubscriptionType;

/**
 * Created by aleh on 28.03.14.
 */
public abstract class SubscriptionTypeBuilder {

    private SubscriptionType type;

    public SubscriptionType getType() {
        return type;
    }

    protected void setType(SubscriptionType type) {
        this.type = type;
    }

    public abstract void createNewSubscriptionType(SubscriptionTypeDTO typeDTO) throws ClassCastException;

    public void buildSubscriptionType(SubscriptionTypeDTO typeDTO) throws ClassCastException {
        type.setSubscriber(typeDTO.subscriber);
        type.setPublisher(typeDTO.publisher);
        type.setPrice(typeDTO.price);
    }
}
