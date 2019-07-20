package com.ithema;

import java.util.List;

public class Permission {


    private Integer id;

    private String permissionname;

    private String permissiondesc;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getPermissiondesc() {
        return permissiondesc;
    }

    public void setPermissiondesc(String permissiondesc) {
        this.permissiondesc = permissiondesc;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permissionname='" + permissionname + '\'' +
                ", permissiondesc='" + permissiondesc + '\'' +
                ", roles=" + roles +
                '}';
    }
}
