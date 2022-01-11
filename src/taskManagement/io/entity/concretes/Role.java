package taskManagement.io.entity.concretes;

import java.util.Collection;

public class Role {
    private int id;
    private String                name;
    private Collection<Privilige> priviliges;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Collection<Privilige> getPriviliges() {
        return this.priviliges;
    }

    public void setPriviliges(final Collection<Privilige> priviliges) {
        this.priviliges = priviliges;
    }
}
