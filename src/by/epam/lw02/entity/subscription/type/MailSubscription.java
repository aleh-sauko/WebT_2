package by.epam.lw02.entity.subscription.type;

/**
 * Created by aleh on 08.03.14.
 */
public class MailSubscription extends SubscriptionType {

    private String country;
    private String city;
    private String address;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                (country == null ? 0 : country.hashCode())*43 +
                (city == null ? 0 : city.hashCode())*131 +
                (address == null ? 0 : address.hashCode())*79;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        MailSubscription o = (MailSubscription) obj;
        return (address == null ? o.address == null : address.equals(o.address)) &&
               (city == null ? o.city == null : city.equals(o.city)) &&
               (country == null ? o.country == null : country.equals(o.country));
    }

    @Override
    public String toString() {
        return super.toString() + "\nCountry : " + country + "\nCity : " + city + "\nAddress : " + address;
    }
}
