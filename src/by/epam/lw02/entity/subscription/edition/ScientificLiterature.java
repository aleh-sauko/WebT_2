package by.epam.lw02.entity.subscription.edition;

/**
 * Created by aleh on 08.03.14.
 */
public class ScientificLiterature extends PrintedEdition {

    private String department;
    private String levelKnowledge;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLevelKnowledge() {
        return levelKnowledge;
    }

    public void setLevelKnowledge(String levelKnowledge) {
        this.levelKnowledge = levelKnowledge;
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                (department == null ? 0 : department.hashCode()) * 159 +
                (levelKnowledge == null ? 0 : levelKnowledge.hashCode()) * 133;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }

        ScientificLiterature o = (ScientificLiterature) obj;
        return (department == null ? o.department == null : department.equals(o.department)) &&
                (levelKnowledge == null ? o.levelKnowledge == null : levelKnowledge.equals(o.levelKnowledge));
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment : " + department + "\nFor whom : " + levelKnowledge;
    }
}
