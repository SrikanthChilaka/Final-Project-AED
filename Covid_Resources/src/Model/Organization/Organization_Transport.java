/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.Role_Transportation;
import java.util.ArrayList;

/**
 *
 * @author srikanthchilaka
 */
public class Organization_Transport extends Organization {
    public Organization_Transport() {
        super(Organization.OrganizationType.Transport.getValue());
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_Transportation());
        return list;
    }
}
