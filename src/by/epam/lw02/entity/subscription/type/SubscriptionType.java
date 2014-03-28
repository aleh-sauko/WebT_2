package by.epam.lw02.entity.subscription.type;

import by.epam.lw02.entity.subscription.PartOfSubscription;

/**
 * Created by aleh on 08.03.14.
 */
public abstract class SubscriptionType extends PartOfSubscription {

    private String publisher;
    private String subscriber;
    private int price;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return (publisher == null ? 0 : publisher.hashCode())*43 +
                (subscriber == null ? 0 : subscriber.hashCode())*157 + price*37;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionType o = (SubscriptionType) obj;
        return (publisher == null ? o.publisher == null : publisher.equals(o.publisher)) &&
               (subscriber == null ? o.subscriber == null : subscriber.equals(o.subscriber)) &&
               price == o.price;
    }

    @Override
    public String toString() {
        return getClass() + "\nPublisher : " + publisher + "\nSubscriber : " + subscriber + "\nPrice : " + price + "$";
    }
}
