package Privilige;

import Role.Role;
import java.util.Collection;

public class Privilige {
    private int id;
    private String name;
    private Collection<Role> roles;

    public Privilige(String name){
        this.name = name;
        System.out.println("Role :" + name + "Worked");
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

    public Collection<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(final Collection<Role> roles) {
        this.roles = roles;
    }
}
