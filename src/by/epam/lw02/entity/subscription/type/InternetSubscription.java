package by.epam.lw02.entity.subscription.type;

/**
 * Created by aleh on 08.03.14.
 */
public class InternetSubscription extends SubscriptionType {

    private String source;
    private String mail;
    private String webPay;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWebPay() {
        return webPay;
    }

    public void setWebPay(String webPay) {
        this.webPay = webPay;
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                (source == null ? 0 : source.hashCode())*47 +
                (mail == null ? 0 : mail.hashCode())*177 +
                (webPay == null ? 0 : webPay.hashCode())*237;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        InternetSubscription o = (InternetSubscription) obj;
        return (source == null ? o.source == null : source.equals(o.source)) &&
                (mail == null ? o.mail == null : mail.equals(o.mail)) &&
                (webPay == null ? o.webPay == null : webPay.equals(o.webPay));
    }

    @Override
    public String toString() {
        return super.toString() + "\nUrl source : " + source + "\nMail : " + mail + "\nWeb Pay : " + webPay;
    }
}
