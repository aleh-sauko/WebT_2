package by.epam.lw02.entity.subscription.edition;

/**
 * Created by aleh on 08.03.14.
 */
public class Journal extends Book {

    private String periodicity;
    private String forWhom;

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getForWhom() {
        return forWhom;
    }

    public void setForWhom(String forWhom) {
        this.forWhom = forWhom;
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                (periodicity == null ? 0 : periodicity.hashCode())*157 +
                (forWhom == null ? 0 : forWhom.hashCode())*163;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }

        Journal o = (Journal) obj;
        return (periodicity == null ? o.periodicity == null : periodicity.equals(o.periodicity)) &&
                (forWhom == null ? o.forWhom == null : forWhom.equals(o.forWhom));
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeriodicity : " + periodicity + "\nFor whom : " + forWhom;
    }
}
