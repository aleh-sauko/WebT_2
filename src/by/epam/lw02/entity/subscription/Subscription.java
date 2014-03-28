package by.epam.lw02.entity.subscription;

/**
 * Created by aleh on 08.03.14.
 */
public class Subscription {

    private PartOfSubscription edition;
    private PartOfSubscription type;

    public PartOfSubscription getEdition() {
        return edition;
    }

    public void setEdition(PartOfSubscription edition) {
        this.edition = edition;
    }

    public PartOfSubscription getType() {
        return type;
    }

    public void setType(PartOfSubscription type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return (edition == null ? 0 : edition.hashCode()) +
                (type == null ? 0 : type.hashCode())*133;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Subscription o = (Subscription) obj;
        return (edition == null ? o.edition == null : edition.equals(o.edition)) &&
                (type == null ? o.type == null : type.equals(o.type));
    }

    @Override
    public String toString() {
        return getClass() + " \n\n################ Subscription ################\n" +
                (type == null ? type : "Subscription type : " + type.getClass().getSimpleName() + "\n" + type.toString()) + "\n" +
                (edition == null ? edition : "\nSubscribe on : " + edition.getClass().getSimpleName() + "\n" + edition.toString()) +
                "\n\n\n";
    }
}