package taskManagement.io.entity.concretes;

import java.util.Collection;

public class PriviligeModel {
    private int id;
    private String                name;
    private Collection<RoleModel> roleModels;

    public PriviligeModel(String name){
        this.name = name;
        System.out.println("taskManagement.io.Role :" + name + "Worked");
    }

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

    public Collection<RoleModel> getRoles() {
        return this.roleModels;
    }

    public void setRoles(final Collection<RoleModel> roleModels) {
        this.roleModels = roleModels;
    }
}
