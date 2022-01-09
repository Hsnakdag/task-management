package taskManagement.io.entity.concretes;

import java.util.Collection;

public class RoleModel {
    private int id;
    private String                     name;
    private Collection<PriviligeModel> priviligeModels;

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

    public Collection<PriviligeModel> getPriviliges() {
        return this.priviligeModels;
    }

    public void setPriviliges(final Collection<PriviligeModel> priviligeModels) {
        this.priviligeModels = priviligeModels;
    }
}
